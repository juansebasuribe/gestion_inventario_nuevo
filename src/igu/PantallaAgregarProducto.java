
package igu;

import java.awt.HeadlessException;
import javax.swing.*;
import logica.Producto;
import logica.ProductoServicio;
import persistencia.ProductoRepositorio;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PantallaAgregarProducto extends JFrame{
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtCategoria;
    private JTextField txtCantidad;
    private JTextField txtPrecioUnitario;
    private JTextField txtFechaExpiracion;
    private ProductoServicio productoServicio;
    
    public PantallaAgregarProducto(ProductoServicio productoServicio1) {
        // Crea una instancia de ProductoRepositorio y pásala a ProductoServicio

        this.productoServicio = productoServicio1;

        // Inicializa los componentes de la pantalla
        initComponents();
    } 
    
    private void initComponents() {
        JLabel lblId = new JLabel("ID:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblCategoria = new JLabel("Categoría:");
        JLabel lblCantidad = new JLabel("Cantidad:");
        JLabel lblPrecioUnitario = new JLabel("Precio Unitario:");
        JLabel lblFechaExpiracion = new JLabel("Fecha de Expiración (yyyy-MM-dd):");

        txtId = new JTextField(20);
        txtNombre = new JTextField(20);
        txtCategoria = new JTextField(20);
        txtCantidad = new JTextField(20);
        txtPrecioUnitario = new JTextField(20);
        txtFechaExpiracion = new JTextField(20);

        JButton btnAgregar = new JButton("Agregar Producto");
        btnAgregar.addActionListener((ActionEvent e) -> {
            agregarProducto();
        });

        // Organizar componentes en el JFrame
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(7, 2));
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
        panel.add(btnAgregar);

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private void agregarProducto() {
        try {
            System.out.println("Intentando agregar producto...");
            short id = Short.parseShort(txtId.getText());
            String nombre = txtNombre.getText();
            String categoria = txtCategoria.getText();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
            String fechaExp = txtFechaExpiracion.getText();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaExpiracion = LocalDate.parse(fechaExp, formatter);

            Producto producto = new Producto(id, nombre, categoria, cantidad, precioUnitario, fechaExpiracion);
            productoServicio.registrarProducto(producto);
            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente");
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el formato de entrada: " + e.getMessage());
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de expiración debe estar en el formato yyyy-MM-dd.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al agregar el producto: " + e.getMessage());
        }
    }
}
