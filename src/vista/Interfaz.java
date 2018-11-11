/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import AppPackage.AnimationClass;
import control.Control_Usuario;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import modelo.Usuario;

/**
 *
 * @author equipo00
 */
public class Interfaz extends javax.swing.JFrame {
//    private static Clip pulsito = Sounds.getSound("../con_pulso.wav");
//    private static Clip sinPulsito = Sounds.getSound("../sin_pulso.wav");

    private static Interfaz INSTANCE = null;

    public static boolean c;
    public static Usuario logueado;

    private Desarrolladores d1;
    private Reporte r;
    private MostrarPulso Ventana;
    private Informacion i1;
    private Formulario f;

    private AnimationClass d = new AnimationClass();

    /**
     * Creates new form Login
     */
    public Interfaz() {
        
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null); //Para que apenas se ejecuta el programa aparezca en el centro

    }

    private synchronized static void crearInstancia() {
        if (INSTANCE == null) {
            INSTANCE = new Interfaz();

        }
    }

    public static Interfaz getInstancia() {
        crearInstancia();
        return INSTANCE;
    }

    public void Openfacebook() {

        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/uvanherfi"));
        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpingreso = new javax.swing.JPanel();
        jlcontraseña = new javax.swing.JLabel();
        jlusuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        js2 = new javax.swing.JSeparator();
        jtfcontraseña1 = new javax.swing.JPasswordField();
        js1 = new javax.swing.JSeparator();
        jliconusuario = new javax.swing.JLabel();
        jliconseguridad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlMusica = new javax.swing.JLabel();
        jlCalculadora = new javax.swing.JLabel();
        jlInternet = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jlsalir = new javax.swing.JLabel();
        JPmenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jlidea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpingreso.setBackground(new java.awt.Color(255, 255, 255));
        jpingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jpingreso.setForeground(new java.awt.Color(0, 153, 153));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlcontraseña.setBackground(new java.awt.Color(238, 112, 82));
        jlcontraseña.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlcontraseña.setForeground(new java.awt.Color(0, 153, 153));
        jlcontraseña.setText("Contraseña:");
        jpingreso.add(jlcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 20));

        jlusuario.setBackground(new java.awt.Color(238, 112, 82));
        jlusuario.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlusuario.setForeground(new java.awt.Color(0, 153, 153));
        jlusuario.setText("Usuario: ");
        jpingreso.add(jlusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-male-user-96.png"))); // NOI18N
        jpingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, 90));

        jtfUsuario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jtfUsuario.setText("Ingrese Usuario");
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
        jpingreso.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, 30));
        jpingreso.add(js2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 210, 10));

        jtfcontraseña1.setForeground(new java.awt.Color(153, 153, 153));
        jtfcontraseña1.setText("jPasswordField1");
        jtfcontraseña1.setBorder(null);
        jtfcontraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfcontraseña1MouseClicked(evt);
            }
        });
        jtfcontraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcontraseña1ActionPerformed(evt);
            }
        });
        jpingreso.add(jtfcontraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, 20));
        jpingreso.add(js1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 200, 10));

        jliconusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-male-user-32.png"))); // NOI18N
        jpingreso.add(jliconusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        jliconseguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-forgot-password-32.png"))); // NOI18N
        jpingreso.add(jliconseguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Menu_32px_1.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jpingreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        jpingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 100, -1));

        jlMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-user-group-man-man-32.png"))); // NOI18N
        jlMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMusicaMouseClicked(evt);
            }
        });
        jpingreso.add(jlMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, 40, 30));

        jlCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-info-32.png"))); // NOI18N
        jlCalculadora.setText("jLabel22");
        jlCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCalculadoraMouseClicked(evt);
            }
        });
        jpingreso.add(jlCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, 40, 40));

        jlInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-facebook-32.png"))); // NOI18N
        jlInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlInternetMouseClicked(evt);
            }
        });
        jpingreso.add(jlInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 50, 30));

        jLabel25.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 153, 153));
        jLabel25.setText("¿Aún no estas registrado?");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel25FocusLost(evt);
            }
        });
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jpingreso.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jlsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sign-out-45.png"))); // NOI18N
        jlsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlsalirMouseClicked(evt);
            }
        });
        jpingreso.add(jlsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        getContentPane().add(jpingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        JPmenu.setBackground(new java.awt.Color(255, 255, 255));
        JPmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        JPmenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-bluetooth-96.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 130, 100));

        jLabel8.setForeground(new java.awt.Color(255, 99, 71));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-pulse-96.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setEnabled(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 120, 90));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-checked-user-male-96.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, 100));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-help-96.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 120, 110));

        jLabel13.setBackground(new java.awt.Color(255, 99, 71));
        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("bluetooh");
        JPmenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 99, 71));
        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("comenzar");
        JPmenu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 120, -1));

        jLabel16.setBackground(new java.awt.Color(255, 99, 71));
        jLabel16.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("registrarse");
        JPmenu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jLabel18.setBackground(new java.awt.Color(255, 99, 71));
        jLabel18.setFont(new java.awt.Font("Eras Demi ITC", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("¿sabías qué?");
        JPmenu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 120, -1));
        JPmenu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-male-user-32.png"))); // NOI18N
        JPmenu.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 40));

        jlUser.setBackground(new java.awt.Color(255, 255, 255));
        jlUser.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jlUser.setForeground(new java.awt.Color(153, 153, 153));
        jlUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUser.setText("user");
        JPmenu.add(jlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, 20));
        JPmenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 70, 10));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        JPmenu.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        jLabel24.setFont(new java.awt.Font("Decker", 2, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Derechos Reservados Copyrigth 2018");
        JPmenu.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 180, -1));

        jlidea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/idea.PNG"))); // NOI18N
        jlidea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlideaMouseClicked(evt);
            }
        });
        JPmenu.add(jlidea, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        getContentPane().add(JPmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jlInternet);

        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, jlCalculadora);

        AnimationClass musica = new AnimationClass();
        musica.jLabelXRight(-40, 10, 10, 5, jlMusica);

        //<----
        AnimationClass internett = new AnimationClass();
        internett.jLabelXLeft(10, -40, 10, 5, jlInternet);

        AnimationClass calculadoraa = new AnimationClass();
        calculadoraa.jLabelXLeft(10, -40, 10, 5, jlCalculadora);

        AnimationClass musicaa = new AnimationClass();
        musicaa.jLabelXLeft(10, -40, 10, 5, jlMusica);


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        this.setState(Interfaz.ICONIFIED);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir ?", "EXIT", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jLabel10.setBorder(null);
        f = Formulario.getInstancia();
        f.setVisible(true);
        hide();


    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        // TODO add your handling code here:
        jLabel10.setFocusable(true);
        Color c = new Color(153, 153, 155);
        Border bordejlabel = new LineBorder(c);

        //Línea 2
        jLabel10.setBorder(bordejlabel);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel25FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel25FocusLost

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:

        new AnimationClass().jLabelYDown(350, 580, 10, 5, jLabel12);
        new AnimationClass().jLabelYUp(580, 350, 10, 5, jlidea);
        new AnimationClass().jLabelYUp(460, 320, 10, 5, jLabel18);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        if (logueado != null) {
            Ventana = MostrarPulso.getInstancia();

            Ventana.setVisible(true);
            hide();
        }
        else{
            JOptionPane.showMessageDialog(null, "DEBE LOGUEARSE PARA ACCEDER A ESTÁ OPCIÓN", "ACCESO DENEGADO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "YA SE ESTA TRANSMITIENDO EN APLICACION", "TRANSMISION BLUETOOTH", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (jtfUsuario.getText().length() != 0 && jtfUsuario.getText().length() != 0) {
            c = Control_Usuario.loginUsuario(jtfUsuario.getText(), jtfcontraseña1.getText());
            if (!c) {
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso");
                jlUser.setText(logueado.getNombres());
                jtfUsuario.setVisible(false);
                jlusuario.setVisible(false);
                jliconusuario.setVisible(false);
                js1.setVisible(false);
                jlcontraseña.setVisible(false);
                jliconseguridad.setVisible(false);
                jtfcontraseña1.setVisible(false);
                js2.setVisible(false);
                jButton1.setVisible(false);
                jLabel25.setVisible(false);
                new AnimationClass().jLabelYDown(90, 220, 10, 5, jLabel3);
                new AnimationClass().jLabelYUp(580, 305, 15, 5, jlsalir);
                Color fondo = new Color(0, 153, 153);
                jpingreso.setBackground(fondo);

            }
        } else {
            JOptionPane.showConfirmDialog(null, "No debe dejar campos vacíos", "ADVERTENCIA", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jtfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsuarioMouseClicked
        jtfUsuario.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioMouseClicked

    private void jtfcontraseña1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfcontraseña1MouseClicked

        jtfcontraseña1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcontraseña1MouseClicked

    private void jlsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsalirMouseClicked
        // TODO add your handling code here:
        new AnimationClass().jLabelYUp(220, 90, 10, 5, jLabel3);
        new AnimationClass().jLabelYDown(305, 580, 15, 5, jlsalir);
        jtfUsuario.setText("Digite su usuario...");
        jtfcontraseña1.setText("Digite su contraseña");
        jlUser.setText("user");
        logueado = null;
        jtfUsuario.setVisible(true);
        jlusuario.setVisible(true);
        jliconusuario.setVisible(true);
        js1.setVisible(true);
        jlcontraseña.setVisible(true);
        jliconseguridad.setVisible(true);
        jtfcontraseña1.setVisible(true);
        js2.setVisible(true);
        jButton1.setVisible(true);
        jLabel25.setVisible(true);
        jpingreso.setBackground(Color.WHITE);
    }//GEN-LAST:event_jlsalirMouseClicked

    private void jlideaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlideaMouseClicked

        new AnimationClass().jLabelYUp(580, 350, 10, 5, jLabel12);
        new AnimationClass().jLabelYDown(350, 580, 10, 5, jlidea);
        new AnimationClass().jLabelYDown(320, 460, 10, 5, jLabel18);

        // TODO add your handling code here:
    }//GEN-LAST:event_jlideaMouseClicked

    private void jtfcontraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcontraseña1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcontraseña1ActionPerformed

    private void jlMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMusicaMouseClicked
        d1 = Desarrolladores.getInstancia();
        d1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlMusicaMouseClicked

    private void jlCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCalculadoraMouseClicked
        // TODO add your handling code here:
        i1 = Informacion.getInstancia();
        i1.setVisible(true);
    }//GEN-LAST:event_jlCalculadoraMouseClicked

    private void jlInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlInternetMouseClicked

        Openfacebook();
// TODO add your handling code here:

    }//GEN-LAST:event_jlInternetMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlCalculadora;
    private javax.swing.JLabel jlInternet;
    private javax.swing.JLabel jlMusica;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlcontraseña;
    private javax.swing.JLabel jliconseguridad;
    private javax.swing.JLabel jliconusuario;
    private javax.swing.JLabel jlidea;
    private javax.swing.JLabel jlsalir;
    private javax.swing.JLabel jlusuario;
    private javax.swing.JPanel jpingreso;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JPasswordField jtfcontraseña1;
    // End of variables declaration//GEN-END:variables
}
