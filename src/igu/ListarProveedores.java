package igu;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Proveedores;
import logica.ProveedoresServicio;
import persistencia.ProveedoresRepositorio;

public class ListarProveedores extends javax.swing.JFrame {

    private final ProveedoresServicio proveedoresServicio;

    // Constructor
    public ListarProveedores(ProveedoresServicio proveedoresServicio) {
        this.proveedoresServicio = proveedoresServicio;
        initComponents();  // Inicializa los componentes de la interfaz gráfica
    }

    // Método para mostrar proveedores en la tabla
    public void mostrarProveedores() {
        List<Proveedores> proveedores = proveedoresServicio.obtenerTodosLosProveedores();

        // Limpiar la tabla antes de cargar nuevos datos
        DefaultTableModel model = (DefaultTableModel) jTableProveedores.getModel();
        model.setRowCount(0); // Eliminar filas existentes

        if (proveedores.isEmpty()) {
            model.addRow(new Object[]{"No hay proveedores registrados."});
        } else {
            for (Proveedores proveedor : proveedores) {
                model.addRow(new Object[]{
                    proveedor.getId(),
                    proveedor.getNombreProveedor(),
                    proveedor.getDireccioonProveedor(),
                    proveedor.getTelefonoProveedor()
                });
            }
        }
    }

    // Código generado automáticamente por el diseñador de la interfaz
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jButtonListarProveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Configuración de la tabla
        jTableProveedores.setModel(new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Nombre", "Dirección", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(jTableProveedores);

        // Botón para listar proveedores
        jButtonListarProveedores.setText("Listar Proveedores");
        jButtonListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarProveedoresActionPerformed(evt);
            }
        });

        // Layout y posicionamiento de los componentes en la interfaz
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonListarProveedores)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonListarProveedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    // Acción del botón "Listar Proveedores"
    private void jButtonListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        mostrarProveedores();  // Llama al método que muestra los proveedores en la tabla
    }

    // Variables
    private javax.swing.JButton jButtonListarProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveedores;

    // Main para ejecutar la interfaz (solo si es necesario)
    public static void main(String[] args) {
        // Ejemplo de cómo crear el servicio de proveedores y mostrar la interfaz
        ProveedoresServicio proveedoresServicio = new ProveedoresServicio();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProveedores(proveedoresServicio).setVisible(true);
            }
        });
    }
}

