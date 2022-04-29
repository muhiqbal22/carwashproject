/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author miqba
 */
public class HelperUtil {

    public String hasil = "0";
    private int angka_pertama;
    private int angka_kedua;

    public static String tocurrency (double rupiah){

        String result = "";

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        //System.out.printf("Harga Rupiah: %s %n", kursIndonesia.format(rupiah));

        result = kursIndonesia.format(rupiah).toString();
        return result;

    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public int getAngka_pertama() {
        return angka_pertama;
    }

    public void setAngka_pertama(int angka_pertama) {
        this.angka_pertama = angka_pertama;
    }

    public int getAngka_kedua() {
        return angka_kedua;
    }

    public void setAngka_kedua(int angka_kedua) {
        this.angka_kedua = angka_kedua;
    }

    public void kali(float a, float b){
        float hasil = a * b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kali(int a, int b){
         int hasil = a * b;
         String total = hasil + "";
         setHasil(total);
    }
    
    public void tambah(float a, float b){
        float hasil = a + b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void tambah(int a, int b){
        int hasil = a + b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void bagi(float a, float b){
        float hasil = a / b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void bagi(int a, int b){
        int hasil = a / b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kurang(float a, float b){
        float hasil = a - b;
        String total = hasil + "";
        setHasil(total);
    }
    
    public void kurang(int a, int b){
        int hasil = a - b;
        String total = hasil + "";
        setHasil(total);
    }

}
