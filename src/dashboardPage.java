/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Vilma Gaming
 */
public class dashboardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashboardPage
     */
    public dashboardPage() {
        initComponents();
        
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    Color narv=new Color(0,51,51);
    Color head=new Color(0,153,153);
    Color bodyc=new Color(0,102,102);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        MANAGER = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        REC = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SETTING = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(null);

        MANAGER.setBackground(new java.awt.Color(0, 153, 153));
        MANAGER.setMinimumSize(new java.awt.Dimension(160, 160));
        MANAGER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MANAGERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MANAGERMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8-user-settings-64.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel3.setName(""); // NOI18N

        jLabel4.setText("MANAGE USER");

        javax.swing.GroupLayout MANAGERLayout = new javax.swing.GroupLayout(MANAGER);
        MANAGER.setLayout(MANAGERLayout);
        MANAGERLayout.setHorizontalGroup(
            MANAGERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGERLayout.createSequentialGroup()
                .addGroup(MANAGERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MANAGERLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MANAGERLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        MANAGERLayout.setVerticalGroup(
            MANAGERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MANAGERLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.add(MANAGER);
        MANAGER.setBounds(90, 60, 110, 130);

        REC.setBackground(new java.awt.Color(0, 153, 153));
        REC.setMinimumSize(new java.awt.Dimension(160, 160));
        REC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RECMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RECMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/record.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel5.setName(""); // NOI18N

        jLabel6.setText("RECORDS");

        javax.swing.GroupLayout RECLayout = new javax.swing.GroupLayout(REC);
        REC.setLayout(RECLayout);
        RECLayout.setHorizontalGroup(
            RECLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RECLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(RECLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        RECLayout.setVerticalGroup(
            RECLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RECLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.add(REC);
        REC.setBounds(340, 60, 110, 130);

        SETTING.setBackground(new java.awt.Color(0, 153, 153));
        SETTING.setMinimumSize(new java.awt.Dimension(160, 160));
        SETTING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SETTINGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SETTINGMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SET.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel7.setName(""); // NOI18N

        jLabel8.setText("SETTINGS");

        javax.swing.GroupLayout SETTINGLayout = new javax.swing.GroupLayout(SETTING);
        SETTING.setLayout(SETTINGLayout);
        SETTINGLayout.setHorizontalGroup(
            SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SETTINGLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        SETTINGLayout.setVerticalGroup(
            SETTINGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SETTINGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.add(SETTING);
        SETTING.setBounds(570, 60, 110, 130);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 770, 270));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(570, 0, 110, 0);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setText("PET ADOPTION SYSTEM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 340, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MANAGERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGERMouseEntered
        MANAGER.setBackground(narv);
    }//GEN-LAST:event_MANAGERMouseEntered

    private void MANAGERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGERMouseExited
        MANAGER.setBackground(head);
    }//GEN-LAST:event_MANAGERMouseExited

    private void SETTINGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGMouseEntered
        SETTING.setBackground(narv);
    }//GEN-LAST:event_SETTINGMouseEntered

    private void SETTINGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGMouseExited
        SETTING.setBackground(head);
    }//GEN-LAST:event_SETTINGMouseExited

    private void RECMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECMouseEntered
        REC.setBackground(narv);
    }//GEN-LAST:event_RECMouseEntered

    private void RECMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECMouseExited
        REC.setBackground(head);
    }//GEN-LAST:event_RECMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MANAGER;
    private javax.swing.JPanel REC;
    private javax.swing.JPanel SETTING;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
