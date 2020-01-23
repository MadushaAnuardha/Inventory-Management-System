/*
 * inventory.java
 *
 * Created on May 11, 2017, 1:22 PM
 */

package System;

import DBconnect.DBcon;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  DELL
 */
public class inventorymain extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
    /** Creates new form inventory */
    public inventorymain() {
        
        initComponents();
        tableload();
        
        txtsearch.setText("");
        txtsearch.setRequestFocusEnabled(true);
              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable123 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventory");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable123.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Name", "Quntity", "Price", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable123);
        jTable123.getColumnModel().getColumn(0).setResizable(false);
        jTable123.getColumnModel().getColumn(1).setResizable(false);
        jTable123.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable123.getColumnModel().getColumn(2).setResizable(false);
        jTable123.getColumnModel().getColumn(3).setResizable(false);
        jTable123.getColumnModel().getColumn(4).setResizable(false);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 970, 450));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 50, 60));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Calibri", 1, 90)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Inventory");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 390, 110));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 70));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1360, 140));

        txtsearch.setText("jTextField1");
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 310, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 768));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1378)/2, (screenSize.height-768)/2, 1378, 768);
    }// </editor-fold>//GEN-END:initComponents

private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    
}//GEN-LAST:event_jLabel1MouseClicked

private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed

}//GEN-LAST:event_txtsearchActionPerformed

private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed

    search();
    
}//GEN-LAST:event_txtsearchKeyPressed

private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
    main m = new main();
    m.setVisible(true);
    this.dispose();
}//GEN-LAST:event_jLabel6MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventorymain().setVisible(true);
            }
        });
    }
    
    public void tableload(){
    
            try {
            
        con = (Connection) DBcon.connect();
        String sql = ("SELECT * FROM inventory i, product p where i.id = p.id");
          DefaultTableModel dtm=(DefaultTableModel) jTable123.getModel();
        pst = (PreparedStatement) con.prepareStatement(sql);
        rs = pst.executeQuery();
        
         while (rs.next()) {                    
                  Object[] rowData={rs.getString("id"),rs.getString("name"),rs.getString("qty"),rs.getString("price"),rs.getString("discount")};
                   dtm.addRow(rowData); 
                }
        
        
       // jTable1.setModel(Dbutil);
            
        } catch (Exception e) {
        
        System.out.println(e);
            
        }
    
    }

    public void search(){
    
            try {
        
         DefaultTableModel dtm=(DefaultTableModel)jTable123.getModel();
         dtm.setRowCount(0);
            
        con = (Connection) DBcon.connect();
        
        String sql = ("SELECT * FROM inventory i, product p where i.id = p.id AND name LIKE '%"+txtsearch.getText()+"%' ");

        pst = (PreparedStatement) con.prepareStatement(sql);
        rs = pst.executeQuery();
        
         while (rs.next()) {                    
                  Object[] rowData={rs.getString("id"),rs.getString("name"),rs.getString("price"),rs.getString("discount"),rs.getString("qty")};
                   dtm.addRow(rowData); 
                }
            
        } catch (Exception e) {
        
        System.out.println(e);
            
        }
    
    }  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable123;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

}
