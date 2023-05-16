/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.HeadlessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;




/**
 *
 * @author Sachi
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reg_uname = new javax.swing.JTextField();
        reg_umail = new javax.swing.JTextField();
        reg_sbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reg_cpass = new javax.swing.JPasswordField();
        reg_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 234, -1));
        jPanel1.add(reg_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 190, -1));

        reg_umail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_umailActionPerformed(evt);
            }
        });
        jPanel1.add(reg_umail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 188, -1));

        reg_sbtn.setBackground(new java.awt.Color(0, 153, 51));
        reg_sbtn.setText("Submit");
        reg_sbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_sbtnMouseClicked(evt);
            }
        });
        reg_sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_sbtnActionPerformed(evt);
            }
        });
        jPanel1.add(reg_sbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 70, -1));

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Already have an accounnt?");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 160, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        reg_cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_cpassActionPerformed(evt);
            }
        });
        jPanel1.add(reg_cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 190, -1));
        jPanel1.add(reg_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("User-Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("E-mail");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Confirm-Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mth_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reg_sbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_sbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_sbtnActionPerformed

    private void reg_umailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_umailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_umailActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         // TODO add your handling code here:
         //Redirection Of the Page
        try{
        
        Login lu = new Login();
        lu.setVisible(true);
        this.dispose();
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void reg_sbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_sbtnMouseClicked
        // TODO add your handling code here:
        //Submit Button After the user Name ,user email and user password are check 
        try {
        if (reg_uname !=null&& reg_umail !=null&& reg_pass !=null&& reg_cpass !=null&& !reg_uname.getText().equals("" )&& !reg_umail.getText().equals("") 
                && ! reg_cpass.getText().equals("")&& !reg_cpass.getText().equals("") ){
            
        //Afer Values Are Correct Message POOps as Register Successful
         String response1 = new SportClient().getServer().Register(reg_uname.getText(),reg_umail.getText(),reg_cpass.getText(),reg_cpass.getText());
         System.out.println("Register ->"+ response1);
         
         
         //redirect to the login form
         
         if(response1.equals("Register Sucessful..")){
         Login ex = new Login();
         ex.setVisible(true);
         this.dispose();
         }else{
         
         JOptionPane.showMessageDialog(this,response1);
         }
        
        }
        
        }catch(HeadlessException | NotBoundException | RemoteException ex ){
        System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_reg_sbtnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //When the Exit button is pressed it goes to the Main Page
        try{
            
        MainPage lu = new MainPage ();
        lu.setVisible(true);
        this.dispose();
        }
        catch(Exception ex){
        System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reg_cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_cpassActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField reg_cpass;
    private javax.swing.JPasswordField reg_pass;
    private javax.swing.JButton reg_sbtn;
    private javax.swing.JTextField reg_umail;
    private javax.swing.JTextField reg_uname;
    // End of variables declaration//GEN-END:variables
}
