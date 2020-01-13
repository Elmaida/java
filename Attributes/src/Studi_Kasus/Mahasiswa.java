/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;

/**
 *
 * @author Mr
 */
public class Mahasiswa {
    String nama = "Elmaida Khoirotuzzuhria";
    String jurusan = "Teknik Informatika";
    int TahunMasuk = 2018;
    
    public static void main (String[]args) {
        Mahasiswa myObj = new Mahasiswa();
        System.out.println("Nama: " + myObj.nama);
        System.out.println("Jurusan: " + myObj.jurusan);
        System.out.println("Tahun Masuk: "+ myObj.TahunMasuk);
    }
    
}
