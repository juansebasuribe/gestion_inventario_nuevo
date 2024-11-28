package igu;


import logica.Producto;
import logica.ProductoServicio;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import logica.Movimientos;
import logica.MovimientosServicio;
import logica.TipoMovimiento;

public class PantallaActualizarProducto extends JFrame {
    private JTextField txtId, txtNombre, txtCategoria, txtCantidad, txtPrecioUnitario, txtFechaExpiracion;
    private JTextField txtCantidadAjuste, txtMotivoAjuste;
    private ProductoServicio productoServicio;
    private Producto productoActual;
    private MovimientosServicio movimientoServicio;
    private Movimientos movimientoActual;

    public PantallaActualizarProducto(ProductoServicio productoServicio, Producto producto, Movimientos movimiento, MovimientosServicio movimientoServicio ) {
        this.productoServicio = productoServicio;
        this.productoActual = producto;
        this.movimientoServicio = movimientoServicio;
        this.movimientoActual = movimiento;
        initComponents();
        cargarDatosProducto();
    }

    private void initComponents() {
        JLabel lblId = new JLabel("ID:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblCategoria = new JLabel("Categoría:");
        JLabel lblCantidad = new JLabel("Cantidad:");
        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        JLabel lblFechaExpiracion = new JLabel("Fecha de Expiración (yyyy-MM-dd):");
        
        JLabel lblCantidadAjuste = new JLabel("Cantidad de Ajuste:");
        JLabel lblMotivoAjuste = new JLabel("Motivo de Ajuste:");

        txtId = new JTextField(String.valueOf(productoActual.getId()));
        txtId.setEnabled(false);  
        txtNombre = new JTextField(productoActual.getNombreProducto());
        txtCategoria = new JTextField(productoActual.getCategoria());
        txtCantidad = new JTextField(String.valueOf(productoActual.getCantidad()));
        txtPrecioUnitario = new JTextField(String.valueOf(productoActual.getPrecioUnitario()));
        txtFechaExpiracion = new JTextField(productoActual.getfechaExpiracion().toString());
        txtCantidadAjuste = new JTextField(movimientoActual.getCantidad());
        txtMotivoAjuste = new JTextField(movimientoActual.getMotivo());

        JButton btnActualizar = new JButton("Actualizar Producto");
        btnActualizar.addActionListener((ActionEvent e) -> actualizarProducto());
/**
        JButton btnAdicionarExistencias = new JButton("Adicionar Existencias");
        btnAdicionarExistencias.addActionListener((ActionEvent e) -> ajustarExistencias(true));

        JButton btnDisminuirExistencias = new JButton("Disminuir Existencias");
        btnDisminuirExistencias.addActionListener((ActionEvent e) -> ajustarExistencias(false));
        **/

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(10, 2));
        panel.add(lblId);
        panel.add(txtId);
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblCategoria);
        panel.add(txtCategoria);
        panel.add(lblCantidad);
        panel.add(txtCantidad);
        panel.add(lblPrecioUnitario);
        panel.add(txtPrecioUnitario);
        panel.add(lblFechaExpiracion);
        panel.add(txtFechaExpiracion);
        panel.add(lblCantidadAjuste);
        panel.add(txtCantidadAjuste);
        panel.add(lblMotivoAjuste);
        panel.add(txtMotivoAjuste);
        /**panel.add(btnAdicionarExistencias);
        panel.add(btnDisminuirExistencias);**/
        panel.add(btnActualizar);

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void cargarDatosProducto() {
        txtNombre.setText(productoActual.getNombreProducto());
        txtCategoria.setText(productoActual.getCategoria());
        txtCantidad.setText(String.valueOf(productoActual.getCantidad()));
        txtPrecioUnitario.setText(String.valueOf(productoActual.getPrecioUnitario()));
        txtFechaExpiracion.setText(productoActual.getfechaExpiracion().toString());
    }

    private void actualizarProducto() {
    try {
        // Validar y actualizar datos básicos del producto
        productoActual.setNombreProducto(txtNombre.getText());
        productoActual.setCategoria(txtCategoria.getText());
        productoActual.setPrecioUnitario(Double.parseDouble(txtPrecioUnitario.getText()));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaExpiracion = LocalDate.parse(txtFechaExpiracion.getText(), formatter);
        productoActual.setFechaExpiracion(fechaExpiracion);

        // Registrar el ajuste de cantidad
        int cantidadAjuste = Integer.parseInt(txtCantidadAjuste.getText().trim());
        String motivoAjuste = txtMotivoAjuste.getText().trim();

        if (motivoAjuste.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un motivo para el ajuste.");
            return;
        }

        TipoMovimiento tipoMovimiento = cantidadAjuste >= 0 
            ? TipoMovimiento.ADICION 
            : TipoMovimiento.DISMINUCION;

        Movimientos nuevoMovimiento = new Movimientos(
            movimientoServicio.ObtenerMovimientos().size() + 1, // Generar ID único
            LocalDate.now(),
            productoActual,
            tipoMovimiento,
            Math.abs(cantidadAjuste), // Convertir cantidad a positivo si es necesario
            motivoAjuste
        );

        // Registrar el movimiento
        movimientoServicio.registrarMovimiento(nuevoMovimiento);

        // Ajustar la cantidad del producto
        productoActual.setCantidad(productoActual.getCantidad() + cantidadAjuste);

        // Guardar el producto actualizado en el repositorio
        productoServicio.actualizarProducto(productoActual, cantidadAjuste, motivoAjuste, tipoMovimiento);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Producto actualizado y movimiento registrado exitosamente.");
        this.dispose(); // Cerrar la pantalla
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el producto: " + e.getMessage());
    }
}


/**
 
    private void ajustarExistencias(boolean adicionar) {
        try {
            int cantidadAjuste = Integer.parseInt(txtCantidadAjuste.getText());
            String motivoAjuste = txtMotivoAjuste.getText().trim();

            if (motivoAjuste.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese el motivo del ajuste.");
                return;
            }

            if (!adicionar && cantidadAjuste > productoActual.getCantidad()) {
                JOptionPane.showMessageDialog(this, "La cantidad a disminuir es mayor que la cantidad disponible.");
                return;
            }

            if (adicionar) {
                productoActual.setCantidad(productoActual.getCantidad() + cantidadAjuste);
            } else {
                productoActual.setCantidad(productoActual.getCantidad() - cantidadAjuste);
            }

            productoServicio.registrarMovimiento(productoActual.getId(), adicionar ? "Adición" : "Reducción", 
                                                 cantidadAjuste, motivoAjuste, LocalDate.now());

            cargarDatosProducto();  // Actualiza los datos en la pantalla
            JOptionPane.showMessageDialog(this, "Ajuste de existencias realizado exitosamente");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para la cantidad de ajuste.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al realizar el ajuste: " + e.getMessage());
        }
    }
   
 * @author asus
 */
}
