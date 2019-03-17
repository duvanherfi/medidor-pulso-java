/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Control_Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author duvan
 */
public class Formulario extends javax.swing.JFrame {

    private static Formulario INSTANCE = null;
    private static Interfaz i;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private synchronized static void crearInstancia() {
        if (INSTANCE == null) {
            INSTANCE = new Formulario();

        }
    }

    public static Formulario getInstancia() {
        crearInstancia();
        return INSTANCE;
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/logo.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfEdad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jtfNombres = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jtfApellidos = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jtfPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRAR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Edad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jtfEdad.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(0, 153, 153));
        jtfEdad.setToolTipText("Ejemplo: 15.");
        jtfEdad.setBorder(null);
        jtfEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfEdadMouseClicked(evt);
            }
        });
        jtfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEdadActionPerformed(evt);
            }
        });
        jtfEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEdadKeyTyped(evt);
            }
        });
        jPanel2.add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 220, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 210, 10));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Peso:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        jtfNombres.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfNombres.setForeground(new java.awt.Color(0, 153, 153));
        jtfNombres.setToolTipText("Ejemplo: Pepito.");
        jtfNombres.setBorder(null);
        jtfNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfNombresMouseClicked(evt);
            }
        });
        jtfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombresActionPerformed(evt);
            }
        });
        jtfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombresKeyTyped(evt);
            }
        });
        jPanel2.add(jtfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 220, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 210, 10));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Apellidos: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jtfApellidos.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfApellidos.setForeground(new java.awt.Color(0, 153, 153));
        jtfApellidos.setToolTipText("Ejemplo: Perez.");
        jtfApellidos.setBorder(null);
        jtfApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfApellidosMouseClicked(evt);
            }
        });
        jtfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidosActionPerformed(evt);
            }
        });
        jtfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidosKeyTyped(evt);
            }
        });
        jPanel2.add(jtfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 220, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 210, 10));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nombres: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 240, 10));

        jtfPeso.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfPeso.setForeground(new java.awt.Color(0, 153, 153));
        jtfPeso.setToolTipText("Ejemplo: 75.");
        jtfPeso.setBorder(null);
        jtfPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPesoMouseClicked(evt);
            }
        });
        jtfPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesoActionPerformed(evt);
            }
        });
        jtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoKeyTyped(evt);
            }
        });
        jPanel2.add(jtfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 230, 30));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Usuario:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        jtfUsuario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(0, 153, 153));
        jtfUsuario.setToolTipText("Ejemplo: pepito22.");
        jtfUsuario.setBorder(null);
        jtfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUsuarioMouseClicked(evt);
            }
        });
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 220, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 230, 10));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Contraseña: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 230, 10));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 10, 320));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-checked-64 (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-checked-64.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-checked-64.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-checked-64.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 90, -1));

        jPassword.setForeground(new java.awt.Color(0, 153, 153));
        jPassword.setText("123456");
        jPassword.setToolTipText("Ejemplo:12323sdsa.");
        jPassword.setBorder(null);
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });
        jPanel2.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 220, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEdadActionPerformed

    private void jtfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombresActionPerformed

    private void jtfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidosActionPerformed

    private void jtfPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesoActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(Interfaz.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        INSTANCE = null;
        i = Interfaz.getInstancia();
        i.show();

        dispose();

    }//GEN-LAST:event_jLabel23MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            int estado;
            if(jtfNombres.getText().getBytes().length !=0 && jtfApellidos.getText().getBytes().length !=0 &&
                    jtfEdad.getText().getBytes().length !=0 && jtfPeso.getText().getBytes().length !=0 &&
                    jtfUsuario.getText().getBytes().length !=0 && jPassword.getText().getBytes().length !=0 ){
                estado=Control_Usuario.registrarUsuario(
                        new Usuario(jtfNombres.getText(), jtfApellidos.getText(), Integer.parseInt(jtfEdad.getText()),
                                Integer.parseInt(jtfPeso.getText()), jtfUsuario.getText(), jPassword.getText()));
                
                if ( estado== 1) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                    jtfNombres.setText("");
                    jtfApellidos.setText("");
                    jtfEdad.setText("");
                    jtfPeso.setText("");
                    jtfUsuario.setText("");
                    jPassword.setText("123333");

                } else if(estado==-3){
                    JOptionPane.showMessageDialog(null, "No se pudo registrar, el usuario ya existe.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar, revisar los campos e intentar nuevamente");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Por favor diligencie todos los campos.");
            }
            
        } catch (Exception nfe) {
            JOptionPane.showMessageDialog(null, "Compruebe los datos ingresados.");

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jtfNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfNombresMouseClicked
        // TODO add your handling code here:
        jtfNombres.setText("");
    }//GEN-LAST:event_jtfNombresMouseClicked

    private void jtfApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfApellidosMouseClicked
        // TODO add your handling code here:
        jtfApellidos.setText("");
    }//GEN-LAST:event_jtfApellidosMouseClicked

    private void jtfEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfEdadMouseClicked
        jtfEdad.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEdadMouseClicked

    private void jtfPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPesoMouseClicked

        // TODO add your handling code here:
        jtfPeso.setText("");
    }//GEN-LAST:event_jtfPesoMouseClicked

    private void jtfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsuarioMouseClicked

        jtfUsuario.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
        jPassword.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordMouseClicked

    private void jtfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombresKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombresKeyTyped

    private void jtfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidosKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidosKeyTyped

    private void jtfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEdadKeyTyped
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtfEdadKeyTyped

    private void jtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoKeyTyped
        // TODO add your handling code here:
        if(Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtfPesoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfNombres;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
