
package igu;


import java.time.LocalDate;
import javax.swing.JOptionPane;
import logica.Movimientos;
import logica.MovimientosServicio;
import logica.Usuario;
import persistencia.UsuarioRepositorio;
import logica.Producto;
import logica.ProductoServicio;
import logica.TipoMovimiento;
import persistencia.ProductoRepositorio;
import persistencia.MovimientoRepositorio;

public class PantallaPrincipal extends javax.swing.JFrame {
    private ProductoServicio productoServicio;
    private MovimientosServicio movimientoServicio;
    private Usuario usuario;
    
    public PantallaPrincipal(Usuario usuario) {  // Recibimos el usuario al iniciar la pantalla
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.productoServicio = new ProductoServicio(
            new ProductoRepositorio(),
            new MovimientosServicio(new MovimientoRepositorio())
        );
        this.movimientoServicio = new MovimientosServicio(new MovimientoRepositorio());
        this.usuario = usuario;  // Guardamos el usuario
        
        // Método para configurar la visibilidad de los botones
    }

    /*private void configurarSeguridad() {
        if (usuario != null) {
            System.out.println("Rol del usuario: " + usuario.getRol());  // Depuración
            if (usuario.getRol().equalsIgnoreCase("auxi")) {
                // Desactivar botones para rol "auxi"
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
            } else {
                // Habilitar botones si no es "auxi"
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jButton7.setEnabled(true);
                jButton8.setEnabled(false);
            }
        }
    }*/
   
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.productoServicio = new ProductoServicio(
            new ProductoRepositorio(),
            new MovimientosServicio(new MovimientoRepositorio())
        );
        this.movimientoServicio = new MovimientosServicio(new MovimientoRepositorio());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido a tu panel de administración"));

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButton1.setText("Agregar Producto");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Listar Productos");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar Producto");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Producto");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Cerrar Sesión");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Movimientos");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Hacer Movimientos");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Proveedores");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaAgregarProducto pantallaAgregarProducto = new PantallaAgregarProducto(productoServicio);
        pantallaAgregarProducto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PantallaListadoProducto pantallaListado = new PantallaListadoProducto(this.productoServicio);
        pantallaListado.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String idStr = JOptionPane.showInputDialog(this, "Ingrese el ID del producto a actualizar:");
    
                if (idStr == null || idStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "ID de producto no ingresado");
                    return;
                }

                try {
                    int id = Integer.parseInt(idStr);

                    if (id <= 0) {
                        JOptionPane.showMessageDialog(this, "Ingrese un ID de producto válido.");
                        return;
                    }
                    
                    Producto producto = productoServicio.consultarProducto(id);
                    Movimientos movimiento = new Movimientos(1, LocalDate.now(), producto, TipoMovimiento.ADICION, 0, ""); // Ejemplo básico
                    MovimientosServicio movimientoServicio = new MovimientosServicio(new MovimientoRepositorio());  




                    if (producto != null) {
                        PantallaActualizarProducto pantallaActualizar = new PantallaActualizarProducto(productoServicio, producto, movimiento, movimientoServicio);
                        pantallaActualizar.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Producto no encontrado con el ID: " + id);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido como ID.");
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String inputId = JOptionPane.showInputDialog(this, "Ingrese el ID del producto a borrar:");
            try {
                int id = Integer.parseInt(inputId);
                productoServicio.eliminarProducto(id);
                JOptionPane.showMessageDialog(this, "Producto borrado exitosamente");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El ID ingresado no es válido.");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pantalla pantallaLogin = new Pantalla();
        pantallaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PantallaMovimientosProducto pantallaMovimiento = new PantallaMovimientosProducto(this.movimientoServicio);
        pantallaMovimiento.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String idStr = JOptionPane.showInputDialog(this, "Ingrese el ID del producto a actualizar:");
        
        if (idStr == null || idStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "ID de producto no ingresado");
                    return;
            }
        
        try {
                    int id = Integer.parseInt(idStr);

                    if (id <= 0) {
                        JOptionPane.showMessageDialog(this, "Ingrese un ID de producto válido.");
                        return;
                    }
                    
                    Producto producto = productoServicio.consultarProducto(id);
                    Movimientos movimiento = new Movimientos(1, LocalDate.now(), producto, TipoMovimiento.ADICION, 0, ""); // Ejemplo básico
                    MovimientosServicio movimientoServicio = new MovimientosServicio(new MovimientoRepositorio());  




                    if (producto != null) {
                        PantallaMovimientosProducto pantallaActualizarMovimiento = new PantallaMovimientosProducto(movimientoServicio);
                        pantallaActualizarMovimiento.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Producto no encontrado con el ID: " + id);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido como ID.");
            }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // Crear una instancia de la pantalla de proveedores
        PantallaProveedores pantallaProveedores = new PantallaProveedores();
    
        // Configurar la pantalla como visible
        javax.swing.SwingUtilities.invokeLater(() -> {
            javax.swing.JFrame frame = new javax.swing.JFrame("Proveedores");
            frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(pantallaProveedores);
            frame.pack();
            frame.setLocationRelativeTo(null); // Centrar en pantalla
            frame.setVisible(true);
        });
    }//GEN-LAST:event_jButton8ActionPerformed

    
    
    public PantallaPrincipal(String email) {
        this.productoServicio = new ProductoServicio(
            new ProductoRepositorio(),
            new MovimientosServicio(new MovimientoRepositorio())
        );
        this.movimientoServicio = new MovimientosServicio(new MovimientoRepositorio());
        initComponents();
        this.setLocationRelativeTo(null);
        
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        Usuario usuario = usuarioRepositorio.obtenerUsuarioPorCorreo(email); // Busca el usuario por email
        
        if (usuario != null) {
            jLabel1.setText(usuario.getNombre()); // Establece el nombre
            jLabel2.setText(usuario.getApellido()); // Establece el apellido
        } else {
            jLabel1.setText("Nombre: No encontrado"); // Manejo de error si no se encuentra el usuario
            jLabel2.setText("Apellido: No encontrado");
        }
        
        if (usuario != null) {
            System.out.println("Rol del usuario: " + usuario.getRol());  // Depuración
            if (usuario.getRol().equalsIgnoreCase("auxi")) {
                // Desactivar botones para rol "auxi"
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
            } else {
                // Habilitar botones si no es "auxi"
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
            }
        }
       
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
