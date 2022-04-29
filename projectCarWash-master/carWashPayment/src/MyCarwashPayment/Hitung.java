/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyCarwashPayment;

import Helper.HelperUtil;

/**
 *
 * @author miqba
 */
public class Hitung extends Log{
    
    public String kali(HelperUtil helpUtil){
        int hasil = helpUtil.getAngka_pertama() * helpUtil.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("Perkalian");
        
        return total;
    }
    
    public String tambah(HelperUtil helpUtil){
        float hasil = helpUtil.getAngka_pertama() + helpUtil.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("Pertambahan");
        
        return total;
    }
    
    public String bagi(HelperUtil helpUtil){
        float hasil = helpUtil.getAngka_pertama() / helpUtil.getAngka_kedua();
        String total = hasil + "";
        
        // Logging
        writeLog("Pembagian");
        
        return total;
    }
    
    public String kurang(HelperUtil helpUtil){
        String result;
        double hasil = helpUtil.getAngka_pertama() - helpUtil.getAngka_kedua();
        //String total = hasil + "";
        result = helpUtil.tocurrency(hasil);        

        // Logging
        writeLog("Pengurangan");
        
        return result;
    }

    @Override
    public void writeLog(String log) {
        System.out.println("Operasi " + log + " telah dijalankan");
    }
}
