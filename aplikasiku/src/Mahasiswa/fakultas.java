/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class fakultas {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/fakultas";
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
                    insertmahasiswa();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updatemahasiswa();
                    break;
                case 4:
                    deletemahasiswa();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM mahasiswa";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA MAHASISWA DI FAKULTAS TEKNIK   ");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                long NIM = rs.getLong("NIM");
                String Nama_Mahasiswa = rs.getString("Nama_Mahasiswa");
                String Alamat = rs.getString("Alamat");
                String Nama_Orangtua = rs.getString("Nama_Orangtua");
                String TTL = rs.getString("TTL");
                long NO_HP = rs.getLong("NO_HP");
                

                
                System.out.println(String.format("%d. %s -- %s -- %S --%S %d", NIM , Nama_Mahasiswa, Alamat, Nama_Orangtua, TTL, NO_HP));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertmahasiswa() {
        try {
            // ambil input dari user
            System.out.print("NIM : ");
            String NIM= input.readLine().trim();
            System.out.println("Nama Mahasiswa: ");
            String Nama_Mahasiswa = input.readLine().trim();
            System.out.println("Alamat: ");
            String Alamat = input.readLine().trim();
            System.out.println ("Nama Orang Tua: ");
            String Nama_Orangtua = input.readLine ().trim();
            System.out.println ("TTL: ");
            String TTL = input.readLine().trim();
            System.out.println ("No. HP: ");
            String NO_HP = input.readLine().trim();
            
            
 
            // query simpan
            String sql = "INSERT INTO mahasiswa (NIM,Nama_mahasiswa, Alamat, Nama_Orangtua,TTL,NO_HP) VALUE('%s','%s', '%s', '%s','%s','%s')";
            sql = String.format(sql, NIM,Nama_Mahasiswa, Alamat, Nama_Orangtua, TTL, NO_HP);
                    
            // simpan mahasiswa
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updatemahasiswa() {
        try {
            
            // ambil input dari user
            System.out.print("NIM yang mau diedit: ");
            long NIM = Long.parseLong(input.readLine());
            System.out.print("Nama Mahasiswa : ");
            String Nama_Mahasiswa = input.readLine().trim();
            System.out.print("Alamat: ");
            String Alamat = input.readLine().trim();
            System.out.println ("Nama Orang Tua: ");
            String Nama_Orangtua = input.readLine ().trim();
            System.out.println ("TTL: ");
            String TTL = input.readLine().trim();
            System.out.println ("No.Hp: ");
            long NO_HP = Long.parseLong (input.readLine());
            

            // query update
            String sql = "UPDATE mahasiswa SET Nama_Mahasiswa ='%s', Alamat='%s', Nama_Orangtua = '%s', TTL ='%s',NO_HP=%d WHERE NIM=%d";
            sql = String.format(sql,Nama_Mahasiswa, Alamat, Nama_Orangtua, TTL, NIM, NO_HP);

            // update data mahasiswa
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deletemahasiswa() {
        try {
            
            // ambil input dari user
            System.out.print("NIM yang mau dihapus: ");
            long NIM = Long.parseLong(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM mahasiswa WHERE NIM=%d", NIM);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
