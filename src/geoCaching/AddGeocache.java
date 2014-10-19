/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Shimal
 */
public class AddGeocache extends javax.swing.JFrame {
    
    // Get the size of the screen
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public String regID = null; // Storing the ID of the latest registrant 
    /**
     * Creates new form Registration
     */
    public AddGeocache() {
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

        GeoCachingPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("GeoCachingPU").createEntityManager();
        geocacherstblQuery = java.beans.Beans.isDesignTime() ? null : GeoCachingPUEntityManager.createQuery("SELECT g FROM Geocacherstbl g");
        geocacherstblList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : geocacherstblQuery.getResultList();
        cachingobjecttblQuery = java.beans.Beans.isDesignTime() ? null : GeoCachingPUEntityManager.createQuery("SELECT c FROM Cachingobjecttbl c");
        cachingobjecttblList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cachingobjecttblQuery.getResultList();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLatitude = new javax.swing.JTextField();
        txtLongitude = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnAddNewUser = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);
        txtArea = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(825, 897, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(825, 897, 0, 0));
        setMaximumSize(new java.awt.Dimension(825, 897));
        setMinimumSize(new java.awt.Dimension(825, 897));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Latitude");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 200, 60, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 320, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("City");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 380, 40, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Longitude");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 260, 70, 15);
        getContentPane().add(txtLatitude);
        txtLatitude.setBounds(340, 190, 206, 33);
        getContentPane().add(txtLongitude);
        txtLongitude.setBounds(340, 250, 206, 33);
        getContentPane().add(txtCountry);
        txtCountry.setBounds(340, 320, 206, 33);
        getContentPane().add(txtCity);
        txtCity.setBounds(340, 370, 206, 33);

        btnAddNewUser.setText("Add New Geocache");
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddNewUser);
        btnAddNewUser.setBounds(310, 660, 162, 44);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/btn_back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 30, 149, 46);
        getContentPane().add(txtArea);
        txtArea.setBounds(340, 440, 206, 33);
        getContentPane().add(txtDescription);
        txtDescription.setBounds(340, 520, 206, 33);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Area");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 440, 50, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Description");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 530, 80, 15);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_new_background.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 860);
        this.setLocation((dim.width-this.getSize().width)/2, (dim.height-this.getSize().height)/2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        register(txtLatitude.getText(), txtLongitude.getText(), txtCountry.getText(), txtCity.getText(), txtArea.getText(), txtDescription.getText());    
        JOptionPane.showMessageDialog(null, "You have successfully added a new Geocache!");
 
        new Home().setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_btnAddNewUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Home().setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddGeocache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGeocache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGeocache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGeocache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGeocache().setVisible(true);
            }
        });
    }
    
    
    
    public String IDgenerator(String country) { // Algorithm to generate cacherID  
        
        String first3Letters = country.substring(0, 3);
        Random num = new Random(3); // Genearting random 3 digit number
        int last3Digits = num.nextInt(899) + 100;                
        String ID = first3Letters + last3Digits;
        regID = ID;
        return ID;
        
    }
    
    public void register(String latitude, String longitude, String country, String city, String area, String description) {
        
        Cachingobjecttbl newGeocache = new Cachingobjecttbl(IDgenerator(country), latitude, longitude, country, city, area, description);
        GeoCachingPUEntityManager.getTransaction().begin(); // Using persistance unit to begin transaction
        GeoCachingPUEntityManager.persist(newGeocache); // Updating database with new user
        GeoCachingPUEntityManager.getTransaction().commit(); // Commiting the changes to the database     
               
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager GeoCachingPUEntityManager;
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnBack;
    private java.util.List<geoCaching.Cachingobjecttbl> cachingobjecttblList;
    private javax.persistence.Query cachingobjecttblQuery;
    private java.util.List<geoCaching.Geocacherstbl> geocacherstblList;
    private javax.persistence.Query geocacherstblQuery;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtLatitude;
    private javax.swing.JTextField txtLongitude;
    // End of variables declaration//GEN-END:variables
}
