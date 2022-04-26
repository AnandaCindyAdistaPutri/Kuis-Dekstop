/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.DriverManager;

/**
 *
 * @author ANANDA CINDY
 */
public class Koneksi {
    
    private static java.sql.Connection Koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (Koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/kuisdekstop";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return Koneksi;
    }
    public static void main(String args[]){
        getKoneksi();
    }
}