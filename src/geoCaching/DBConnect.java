/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Shimal
 */
public class DBConnect {
    
    String host = "jdbc:derby://localhost:1527/GeoCachingDB";

    String UserName = "Geocaching";
    String Password= "admin";
    Connection connect;
    
    public Connection databaseConnect() { 
        try {
            connect = DriverManager.getConnection(host, UserName, Password);            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }    
    return connect;
    }
    
    
    public String getCacherID() throws SQLException {
         Query query = new Query();
        String currentUser = query.getCurrentUser(); // Getting current user. 
        String DBquery = "select CACHERID from GEOCACHERSTBL where CACHERUSERNAME = '" + currentUser + "'";        
        String cacherID = null;
        Statement stmt = null;
        
        try {
        stmt = databaseConnect().createStatement();
        ResultSet rs = stmt.executeQuery(DBquery);
        
        while (rs.next()) {
            cacherID = rs.getString("CACHERID");
            
        }
    } catch (SQLException e ) {
       JOptionPane.showMessageDialog(null, e); 
       
    } finally {
        if (stmt != null) { stmt.close(); }
    }
    return cacherID;
}
    
    public Boolean checkLogin(String username, String password) throws SQLException {
        Boolean flag = false;
        String DBquery = "select * from GEOCACHERSTBL where CACHERUSERNAME = '" + username + "'";    
        Statement stmt = null;
        String cacherUsername = null;
        String cacherPassword = null;
                
        
        try {
        stmt = databaseConnect().createStatement();
        ResultSet rs = stmt.executeQuery(DBquery);
        
        while (rs.next()) {
            cacherUsername = rs.getString("CACHERUSERNAME");
            cacherPassword = rs.getString("CACHERPASSWORD");
            
        }
        
        if (username == cacherUsername && password == cacherPassword) {
            flag = true;
        } else {
            JOptionPane.showMessageDialog(null, "Please re-enter your password"); 
        }
        
    } catch (SQLException e ) {
       JOptionPane.showMessageDialog(null, "Please re-enter your username"); 
       
    } finally {
        if (stmt != null) { stmt.close(); }
    }
    return flag;
}
    
}
