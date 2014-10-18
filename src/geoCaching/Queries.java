/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shimal
 */
public class Queries {
    
    public static final String country = "OBJCOUNTRY";
    public static final String city = "OBJCITY";
    public static final String area = "OBJAREA";

    public static String getCountry() {
        return country;
    }

    public static String getCity() {
        return city;
    }

    public static String getArea() {
        return area;
    }
    
 
    
    
    public static DefaultTableModel buildTableModel(ResultSet rs)  throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

         // names of columns
        Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
                for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnName(column));
            }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }

    return new DefaultTableModel(data, columnNames);

}
            
    
    public void findGeocachers(String locationType, String userLocation) {
    
            String DBquery = "select * from CACHINGOBJECTTBL where " + locationType + " = '" + userLocation + "'";
            Statement stmt = null;
            DBConnect connection = new DBConnect();
            
            
            
            try {
                stmt = connection.databaseConnect().createStatement();
                ResultSet results = stmt.executeQuery(DBquery);

                JTable table = new JTable(buildTableModel(results));
                JOptionPane.showMessageDialog(null, new JScrollPane(table)); 
                
                  } catch (SQLException e ) {
                       JOptionPane.showMessageDialog(null, "There was an error"); 

                    } finally {
                        if (stmt != null) { try {
                            stmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(FindGeocache.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                    }
    
    
    
    }
    
    public String findUserCountry(String user) {
        
         String DBquery = "select CACHERCOUNTRY from GEOCACHERSTBL where CACHERUSERNAME = '" + user + "'";
         Statement stmt = null;
        String country = null;
        DBConnect connection = new DBConnect();
                
        
                try {
                stmt = connection.databaseConnect().createStatement();
                ResultSet rs = stmt.executeQuery(DBquery);

                while (rs.next()) {
                    country= rs.getString("CACHERCOUNTRY");


                }      
                  } catch (SQLException e ) {
                       JOptionPane.showMessageDialog(null, "Please re-enter your username"); 

                    } finally {
                        if (stmt != null) { try {
                            stmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(FindGeocache.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                    }
        
        return country;
    }
    
    public String findUserCity(String user) {
        
         String DBquery = "select CACHERCITY from GEOCACHERSTBL where CACHERUSERNAME = '" + user + "'";
         Statement stmt = null;
        String city = null;
        DBConnect connection = new DBConnect();
                
        
                try {
                stmt = connection.databaseConnect().createStatement();
                ResultSet rs = stmt.executeQuery(DBquery);

                while (rs.next()) {
                    city= rs.getString("CACHERCITY");


                }      
                  } catch (SQLException e ) {
                       JOptionPane.showMessageDialog(null, "Please re-enter your username"); 

                    } finally {
                        if (stmt != null) { try {
                            stmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(FindGeocache.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                    }
        
        return city;
    }
    
    public String findUserArea(String user) {
        
         String DBquery = "select CACHERAREA from GEOCACHERSTBL where CACHERUSERNAME = '" + user + "'";
         Statement stmt = null;
        String area = null;
        DBConnect connection = new DBConnect();
                
        
                try {
                stmt = connection.databaseConnect().createStatement();
                ResultSet rs = stmt.executeQuery(DBquery);

                while (rs.next()) {
                    area= rs.getString("CACHERAREA");


                }      
                  } catch (SQLException e ) {
                       JOptionPane.showMessageDialog(null, "Please re-enter your username"); 

                    } finally {
                        if (stmt != null) { try {
                            stmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(FindGeocache.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                    }
        
        return area;
    }
    
}
