/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Query;

/**
 *
 * @author miqba
 */
public class MainQuery {
    
public String create = "INSERT INTO cucian (nama_pembeli, tipe_mobil, " + 
            "jumlah, harga, tanggal) VALUES (?, ?, ?, ?, ?)";

    public String get = "SELECT * FROM cucian";
    public String showById = "SELECT * FROM cucian where id = ?";
    public String showByName = "SELECT * FROM cucian where name LIKE ?";   
    
    public String update = "UPDATE cucian SET nama = ?, "
 + "tipe_mobil = ?, jumlah = ?, harga = ?, tanggal = ? WHERE id = ?";
    public String delete = "DELETE FROM cucian WHERE id = ?";
}

