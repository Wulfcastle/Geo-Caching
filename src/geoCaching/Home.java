/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

/**
 *
 * @author Shimal
 */
public class Home extends javax.swing.JFrame {
    
        public String ID = "123456";

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnLogout = new javax.swing.JButton();
        btnLogout.setOpaque(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setBorderPainted(false);
        btnProfile = new javax.swing.JButton();
        btnProfile.setOpaque(false);
        btnProfile.setContentAreaFilled(false);
        btnProfile.setBorderPainted(false);
        btnAddGeocache = new javax.swing.JButton();
        btnAddGeocache.setOpaque(false);
        btnAddGeocache.setContentAreaFilled(false);
        btnAddGeocache.setBorderPainted(false);
        btnFind = new javax.swing.JButton();
        btnFind.setOpaque(false);
        btnFind.setContentAreaFilled(false);
        btnFind.setBorderPainted(false);
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1047, 752));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1047, 752));
        setMaximumSize(new java.awt.Dimension(1047, 752));
        setMinimumSize(new java.awt.Dimension(1047, 752));
        getContentPane().setLayout(null);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/btn_logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(40, 563, 150, 60);

        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/btn_edit_profile.png"))); // NOI18N
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfile);
        btnProfile.setBounds(780, 560, 160, 70);

        btnAddGeocache.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/btn_add.png"))); // NOI18N
        btnAddGeocache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGeocacheActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddGeocache);
        btnAddGeocache.setBounds(270, 560, 210, 70);

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttons/btn_search.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(520, 560, 180, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home_background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1032, 712);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new Profile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnAddGeocacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGeocacheActionPerformed
        new AddGeocache().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddGeocacheActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        new FindGeocache().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }
    
    private javax.persistence.EntityManager GeoCachingPUEntityManager;
     private java.util.List<geoCaching.Geocacherstbl> geocacherstblList;
    private javax.persistence.Query geocacherstblQuery;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGeocache;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
