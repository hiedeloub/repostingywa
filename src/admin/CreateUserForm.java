package admin;

import user.UserDashboard;
import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

/**
 *
 * @author PC7
 */
public class CreateUserForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateUserForm
     */
    public CreateUserForm() {
        initComponents();
    }
    
    public  String destination = "";
    File selectedfile;
    public String oldpath;
    public String path;
    public String image;
    public String ImageIcon;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, JLabel label, String image1) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
        String pic = null;
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
    
}
    
     public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedfile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }

    
    public static String email, usern;
     public boolean duplicateCheck(){
         dbConnector dbc = new dbConnector();
         try{
             String query = "SELECT * FROM tbl_user WHERE u_email = '"+em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            
           if(resultSet.next()){
               
               email = resultSet.getString("u_email");
               System.out.println(""+email);
               if(email.equals(em.getText())){
                   JOptionPane.showMessageDialog(null,"Email is Already Used!"); 
                   em.setText("");
               }
               usern = resultSet.getString("u_user");
               System.out.println(""+usern);
               if(usern.equals(usrn.getText())){
                   JOptionPane.showMessageDialog(null,"User is Already Used!"); 
                   usrn.setText("");
               }
               return true;
           }else{
               return false;
           }
        }catch (SQLException ex){
            System.out.println(""+ex);
            return false; 
         }
     }
     
     public boolean updateCheck(){
         dbConnector dbc = new dbConnector();
         try{
             String query = "SELECT * FROM tbl_user WHERE u_email = '"+em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            
           if(resultSet.next()){
               
               email = resultSet.getString("u_email");
               System.out.println(""+email);
               if(email.equals(em.getText())){
                   JOptionPane.showMessageDialog(null,"Email is Already Used!"); 
                   em.setText("");
               }
               usern = resultSet.getString("u_user");
               System.out.println(""+usern);
               if(usern.equals(usrn.getText())){
                   JOptionPane.showMessageDialog(null,"User is Already Used!"); 
                   usrn.setText("");
               }
               return true;
           }else{
               return false;
           }
        }catch (SQLException ex){
            System.out.println(""+ex);
            return false; 
         }
     }
    
    Color hover=new Color(204,204,255);
    Color defbutton=new Color(153,153,255);
    
    Border empty=BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        usrn = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        fn = new javax.swing.JLabel();
        emel = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        passw = new javax.swing.JTextField();
        uid = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        us = new javax.swing.JComboBox<>();
        CLEAR = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELTE = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        images = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BACK");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        nm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 30));

        usrn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usrn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(usrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 200, 30));

        em.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, 30));

        fn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        fn.setText("Full Name:");
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));

        emel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        emel.setText("Email:");
        jPanel3.add(emel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        user.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        user.setText("User:");
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 30));

        pass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        pass.setText("Password:");
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 30));

        type.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        type.setText("Account Type:");
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 200, 30));

        passw.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passw.setEnabled(false);
        jPanel3.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 200, 30));

        uid.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));

        id.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        id.setText("User ID:");
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));

        type1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        type1.setText("Status");
        jPanel3.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 30));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 200, 30));

        CLEAR.setBackground(new java.awt.Color(153, 153, 255));
        CLEAR.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CLEAR.setText("CLEAR");
        jPanel3.add(CLEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 90, 30));

        ADD.setBackground(new java.awt.Color(153, 153, 255));
        ADD.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel3.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 30));

        REFRESH.setBackground(new java.awt.Color(153, 153, 255));
        REFRESH.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        REFRESH.setText("REFRESH");
        jPanel3.add(REFRESH, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 90, 30));

        UPDATE.setBackground(new java.awt.Color(153, 153, 255));
        UPDATE.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setEnabled(false);
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel3.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 30));

        DELTE.setBackground(new java.awt.Color(153, 153, 255));
        DELTE.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DELTE.setText("DELETE");
        DELTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELTEActionPerformed(evt);
            }
        });
        jPanel3.add(DELTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 90, 30));

        remove.setBackground(new java.awt.Color(153, 153, 255));
        remove.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 80, 30));

        select.setBackground(new java.awt.Color(153, 153, 255));
        select.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel3.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, 30));

        jPanel2.setLayout(null);
        jPanel2.add(images);
        images.setBounds(10, 11, 160, 258);

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        userPage up = new userPage();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        if(nm.getText().isEmpty()||em.getText().isEmpty()||usrn.getText().isEmpty()||passw.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"All Fields are Required");
        }else{if(passw.getText().length() < 8){
            JOptionPane.showMessageDialog(null,"Password character should be 8 above");
            passw.setText("");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");
        }else{
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_name = '"+nm.getText()+"', u_email = '"+em.getText()+""
          + "', u_user = '"+usrn.getText()+"', u_password = '"+passw.getText()+"', "
            + "u_type = '"+ut.getSelectedItem()+"', u_status = '"+us.getSelectedItem()+"'"
                    + " WHERE u_id = '"+uid.getText()+"'");
        
             if(destination.isEmpty()){
             File existingFile = new File(oldpath);
             if(existingFile.exists())
              existingFile.delete();
          }
            if(!(oldpath.equals(path))){
            imageUpdater(oldpath, path);
           }
         }
       
            userPage up =new userPage();
            up.setVisible(true);
            this.dispose();
       }     
    }//GEN-LAST:event_UPDATEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        if(nm.getText().isEmpty()||em.getText().isEmpty()||usrn.getText().isEmpty()||passw.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"All Fields are Required");
        }else{if(passw.getText().length() < 8){
            JOptionPane.showMessageDialog(null,"Password character should be 8 above");
            passw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user (u_name, u_email, u_user, u_password, u_type, u_status)"
            + "VALUES('"+nm.getText()+"', '"+em.getText()+"', '"+usrn.getText()+"', '"+passw.getText()+"', "
               + "'"+ut.getSelectedItem()+"', '"+us.getSelectedItem()+"', '"+destination+"')"))
        {
            
          try{
            Files.copy(selectedfile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null,"Inserted Success!");
            userPage up =new userPage();
            up.setVisible(true);
            this.dispose();
            
            }catch(IOException ex){
             System.out.println("Insert Image Error: "+ex);
         }

        }else{
            JOptionPane.showMessageDialog(null,"Connection Error");
        }
        }
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void DELTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELTEActionPerformed
        
    }//GEN-LAST:event_DELTEActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        select.setEnabled(true);
        remove.setEnabled(false);
        ImageIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedfile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedfile.getName();
                        path  = selectedfile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                         
                            ImageIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                        }
                       
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
                
    }//GEN-LAST:event_selectActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ADD;
    public javax.swing.JButton CLEAR;
    public javax.swing.JButton DELTE;
    public javax.swing.JButton REFRESH;
    public javax.swing.JButton UPDATE;
    public javax.swing.JTextField em;
    private javax.swing.JLabel emel;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel id;
    private javax.swing.JLabel images;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField nm;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField passw;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    public javax.swing.JTextField uid;
    public javax.swing.JComboBox<String> us;
    private javax.swing.JLabel user;
    public javax.swing.JTextField usrn;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables

    private void ImageIcon(Object object) {
       
    }
}
