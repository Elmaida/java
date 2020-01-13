/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author Mr
 */
public class NonStatic {
     
     //class dalam/inner class pertama
     private class Laptop {
         private String merk = "ASUS";
         private float kecepatan = 2.0f;
         private void jalankan(){
             System.out.println("Merk Laptop :" + merk);
             System.out.println("Kecepatan Laptop: " +kecepatan);
         }
     }
     //class dalam/Inner Class kedua
     private class pengguna{
         private String nama = " Elmaida";
         private int umur = 19;
         private void identitas(){
             System.out.println("Nama saya :" + nama );
             System.out.println("Usia saya: " + umur);
         }
     }
     public static void main (String []args){
         //membuat Instance dari NonStatic
         NonStatic outerclass = new NonStatic();
         
         //membuat instance dari kelas dalam (mobil)
         NonStatic.Laptop data1 = outerclass.new Laptop();
         
         //membuat instance dari kelas dalam (pengguna)
         NonStatic.pengguna data2 = outerclass.new pengguna();
         
         //menampilkan hasil output
         System.out.println("=====DATA DARI CLASS LAPTOP=====");
         data1.jalankan();
         System.out.println("===== DATA DARI PENGGUNA=====");
         data2.identitas();
     }
   }
