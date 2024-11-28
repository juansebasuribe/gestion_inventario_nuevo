package igu;

import logica.Producto;
import logica.ProductoServicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PantallaListadoProducto extends JFrame {
    private final ProductoServicio productoServicio;
    private JTable tablaProductos;
    private DefaultTableModel modelo;

    public PantallaListadoProducto(ProductoServicio productoServicio1) {
        this.productoServicio = productoServicio1; // Utiliza la instancia pasada como parámetro
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("Listado de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear una tabla para mostrar los productos
        String[] columnas = {"ID", "Nombre", "Categoría", "Cantidad", "Precio", "Fecha de Expiración"};
        modelo = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        add(scrollPane, BorderLayout.CENTER);

        // Agregar botón para exportar a CSV
        JButton btnExportarCSV = new JButton("Exportar a CSV");
        btnExportarCSV.addActionListener(e -> exportarAExcel());
        add(btnExportarCSV, BorderLayout.SOUTH);

        cargarDatosProductos();
    }

    public void cargarDatosProductos() {
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        List<Producto> productos = productoServicio.obtenerTodosLosProductos();
        for (Producto producto : productos) {
            Object[] fila = {
                producto.getId(),
                producto.getNombreProducto(),
                producto.getCategoria(),
                producto.getCantidad(),
                producto.getPrecioUnitario(),
                producto.getfechaExpiracion()
            };
            modelo.addRow(fila);
        }
        
        // Actualizar la tabla
        modelo.fireTableDataChanged();
    }

    // Método para exportar los datos de la tabla a un archivo CSV
    private void exportarAExcel() {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo CSV");
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = fileChooser.getSelectedFile();
                if (!archivoSeleccionado.getName().endsWith(".csv")) {
                    archivoSeleccionado = new File(archivoSeleccionado.getAbsolutePath() + ".csv");
                }

                FileWriter writer = new FileWriter(archivoSeleccionado);
                
                // Escribir los encabezados
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    writer.append(modelo.getColumnName(i));
                    if (i < modelo.getColumnCount() - 1) writer.append(',');
                }
                writer.append('\n');

                // Escribir los datos de la tabla
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    for (int j = 0; j < modelo.getColumnCount(); j++) {
                        writer.append(modelo.getValueAt(i, j).toString());
                        if (j < modelo.getColumnCount() - 1) writer.append(',');
                    }
                    writer.append('\n');
                }

                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(this, "Archivo CSV guardado exitosamente.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo CSV.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
