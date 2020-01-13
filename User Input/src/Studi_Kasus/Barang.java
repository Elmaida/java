/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;

import java.util.Scanner;

public class Barang {
    public static void main (String[]args) {
        System.out.println ("Contoh Program Input dan Output Scanner");
        Scanner input = new Scanner (System.in);
        //membuat atau menginstalasi objek baru input
        //untuk mengambil nilai input user
        
        System.out.println ("Masukkan Nama Barang: ");
        String nama = input.nextLine();
        //mengambil nilai input tipe data String
        //lalu menyimpannya di variabel nama
        
        System.out.println ("Harga Barang: ");
        int harga = input.nextInt();
        //mengambil nilai input tipe data integer
        //lalu mneyimpannya di variabel harga
        
       System.out.println ("-----Hasil Output-----");
       System.out.println ("Nama Barang: " + nama);
       System.out.println ("Harga: " + harga + "Rupiah");
       //menampilkan hasil output
    } }
