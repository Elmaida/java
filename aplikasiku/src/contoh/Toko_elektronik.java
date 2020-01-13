/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author Mr
*///import bumbu-bumbu yang diperlukan

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Toko_elektronik {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/toko elektronik";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertBarang();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateBarang();
                    break;
                case 4:
                    deleteBarang();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM elektronik";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA PEMBEIAN ELEKTRONIK DI TOKO ELEKTRONIK  |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int Kode_Barang = rs.getInt("kode_barang");
                String Nama_Barang= rs.getString("nama barang");
                String Merk = rs.getString("Merk");
                String Pembuat = rs.getString("Pembeli: ");
                String Tanggal_Pembelian = rs.getString ("Tanggal Pembelian: ");

                
                System.out.println(String.format("%d %s -- (%s) %s %s", Kode_Barang, Nama_Barang, Merk, Pembuat, Tanggal_Pembelian));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertBarang() {
        try {
            // ambil input dari user
            System.out.println ("Kode Barang: ");
            String Kode_Barang = input.readLine().trim();
            System.out.print("Nama Barang: ");
            String Nama_Barang = input.readLine().trim();
            System.out.print("Merk: ");
            String Merk = input.readLine().trim();
            System.out.println ("Pembeli: ");
            String Pembuat = input.readLine().trim();
            System.out.println ("Tanggal Pembelian: ");
            String Tanggal_Pembelian = input.readLine().trim();
 
            // query simpan
            String sql = "INSERT INTO buku (Kode_Barang, Nama_Barang, Merk, Pembuat, Tanggal_Pembelian) VALUE('%s', '%s', '%s','%s', '%s')";
            sql = String.format(sql, Kode_Barang, Nama_Barang, Merk, Pembuat, Tanggal_Pembelian);

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateBarang() {
        try {
            
            // ambil input dari user
            System.out.print("Kode barang yang mau d edit: ");
            int Kode_Barang = Integer.parseInt(input.readLine());
            System.out.print("Nama Barang: ");
            String Nama_Barang = input.readLine().trim();
            System.out.print("Merk: ");
            String Merk = input.readLine().trim();
            System.out.print("Pembeli: ");
            String Pembuat = input.readLine().trim();
            System.out.println ("Tanggal Pembelian: ");
            String Tanggal_Pembelian = input.readLine().trim();


            // query update
            String sql = "UPDATE elektronik SET Nama_Barang='%s', Merk='%s', Pembeli= '%s' , Tanggal_Pembelian= '%s'WHERE Kode_Barang=%d";
            sql = String.format(sql, Nama_Barang, Merk, Pembuat, Kode_Barang, Tanggal_Pembelian);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteBarang() {
        try {
            
            // ambil input dari user
            System.out.print("kode barang yang mau di hapus: ");
            int Kode_Barang = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM elektronik WHERE Kode_Barang=%d", Kode_Barang);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
