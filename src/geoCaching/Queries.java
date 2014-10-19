/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geoCaching;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    
    public static final String cacherCountry = "CACHERCOUNTRY";
    public static final String cacherCity = "CACHERCITY";
    public static final String cacherArea = "CACHERAREA";

    
    public static String getCountry() {
        return country;
    }

    public static String getCity() {
        return city;
    }

    public static String getArea() {
        return area;
    }

    public static String getCacherCountry() {
        return cacherCountry;
    }

    public static String getCacherCity() {
        return cacherCity;
    }

    public static String getCacherArea() {
        return cacherArea;
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
                JScrollPane scrollPane = new JScrollPane(table);
                JFrame frame = new JFrame("Results");
                frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
                frame.setSize(860, 800);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);   
                
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
    
    public String findUserLocation(String user, String locationType) {
        
         String DBquery = "select " + locationType + " from GEOCACHERSTBL where CACHERUSERNAME = '" + user + "'";
         Statement stmt = null;
        String location = null;
        DBConnect connection = new DBConnect();
                
        
                try {
                stmt = connection.databaseConnect().createStatement();
                ResultSet rs = stmt.executeQuery(DBquery);

                while (rs.next()) {
                    location= rs.getString(locationType);


                }      
                  } catch (SQLException e ) {
                       JOptionPane.showMessageDialog(null, "Error connectiong to database"); 

                    } finally {
                        if (stmt != null) { try {
                            stmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(FindGeocache.class.getName()).log(Level.SEVERE, null, ex);
                            }
                }
                    }
        
        return location;
    }
    
       
}
