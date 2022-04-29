/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyCarwashPayment;

import connection.DBConnection;

/**
 *
 * @author miqba
 */
public class MyCarwashPayment {

    public static void main(String[] args) {
        carWashPaymentFrame frameCarWash = new carWashPaymentFrame();
        DBConnection con = new DBConnection();
        System.out.println(con.open());
        frameCarWash.setLocationRelativeTo(null);
        frameCarWash.setVisible(true);
    }

}
