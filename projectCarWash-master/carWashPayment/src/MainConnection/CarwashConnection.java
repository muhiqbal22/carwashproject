/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainConnection;

import connection.DBConnection;

/**
 *
 * @author miqba
 */
public class CarwashConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection con = new DBConnection();
        System.out.println(con.open());
    }
    
}
