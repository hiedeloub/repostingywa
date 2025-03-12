/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Vilma Gaming
 */
public class dbConnector {
    
    private Connection connect;
    
    //constructor to connect to our database    
    public dbConnector(){
        try{
            connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/hiede_db", "root", "");
        }catch(SQLException ex){
            System.out.println("Can't Connect to database:"+ex.getMessage());
            
        }
    }
    
    
    public ResultSet getData(String sql)throws SQLException{
       
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
        
    }
    
    //Function to save data
        public boolean insertData (String sql){
       try{
        PreparedStatement pst = connect.prepareStatement(sql);
        pst. executeUpdate () ;
        System.out.println("Inserted Successfully!");
        pst. close();
           return true;
    }catch (SQLException ex){
     System.out.println("Connection Error:" +ex);
       return false;

    }
       
}
        
         //Function to update data
        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }

}
