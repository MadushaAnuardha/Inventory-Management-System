/*
 * login.java
 *
 * Created on May 14, 2017, 8:58 AM
 */

package System;

import DBconnect.DBcon;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.lang.String;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author  DELL
 */
public class login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /** Creates new form login */
    public login() {
        initComponents();
        
        lblinvalid.setVisible(false);
        txtname.setText("");
        pswd.setText("");
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblinvalid = new javax.swing.JLabel();
        pswd = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 190, 40));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Calibri", 1, 90)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Login");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 360, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 120));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("You are not login");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 84, 140, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 250, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 140));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 40));

        lblinvalid.setBackground(new java.awt.Color(255, 255, 255));
        lblinvalid.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblinvalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinvalid.setText("Your user name and password does not match");
        lblinvalid.setOpaque(true);
        getContentPane().add(lblinvalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 380, 20));

        pswd.setText("jPasswordField1");
        pswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdActionPerformed(evt);
            }
        });
        getContentPane().add(pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 280, 40));

        txtname.setText("jTextField1");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 280, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-809)/2, (screenSize.height-495)/2, 809, 495);
    }// </editor-fold>//GEN-END:initComponents

private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

   log();
    
}//GEN-LAST:event_jLabel3MouseClicked

private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
    pswd.grabFocus();
}//GEN-LAST:event_txtnameActionPerformed

private void pswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdActionPerformed
    jLabel3.grabFocus();
    log();
}//GEN-LAST:event_pswdActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblinvalid;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    public void log(){
    
         try {
        con = (Connection) DBcon.connect();   
        String s = (" SELECT * FROM user WHERE username = '"+txtname.getText()+"' AND password = '"+pswd.getText()+"' ");
        
        pst = (PreparedStatement) con.prepareStatement(s);
        rs = pst.executeQuery();
        
        if (rs.next()) {            
            
            if ( rs.getString("type").equals("user") ){
              
                main m = new main(txtname.getText());
                m.setVisible(true);
                
                this.dispose();
                
          }  
            
            else{
                
                   pos p = new pos(txtname.getText());
                   p.setVisible(true);
                      
                   this.dispose();
                   
                }
                
            }    
        
        else{
        
           lblinvalid.setVisible(true);
           txtname.setText("");
           pswd.setText("");
            
        }
            
        
    } 
    catch (Exception e) {
        
        System.out.println(e);
        
    }
        
    }
    
    
}