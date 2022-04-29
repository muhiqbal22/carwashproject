package BaseController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import connection.DBConnection;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author miqba
 */
public class BaseController {
  
    DBConnection koneksi = new DBConnection();
    
    public boolean preparedStatement(Map<Integer, Object> map, String sql) {
       
         try {
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for(Map.Entry<Integer, Object> entry : map.entrySet()) {
                ps.setString(entry.getKey(), entry.getValue().toString());
            }
            
            int rows = ps.executeUpdate();
            con.close();
            
            return rows != 0;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

