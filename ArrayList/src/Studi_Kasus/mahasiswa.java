/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;

import java.util.ArrayList;
import java.util.List;

public class mahasiswa {
    public static void main (String[]args) {
       //membuat object array list dengan tipe data String
       List <String> mahasiswa =  new ArrayList<>();
       //menambahkan Data String pada Object mahasiswa
       mahasiswa.add ("Elmaida Khoirotuzzuhria");
       mahasiswa.add ("Atiqotuz Zummah");
       mahasiswa.add ("Dafina Agustina");
       mahasiswa.add ("Risalatul Muawannah");
       
       //membuat object array dengan tipe data Integer
       List <Integer> nim = new ArrayList<>();
       //menambahkan data integer pada objek nim
       nim.add (003);
       nim.add (006);
       nim.add (014);
       nim.add (001);
       
       //mencetak nilai semua nilai menggunakan for-loop
       System.out.println (mahasiswa);
       System.out.println (nim);
    }
    }
