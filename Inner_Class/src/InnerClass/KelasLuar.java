/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

 //outer class/kelasLuar
 public class KelasLuar {
     
     //class dalam/inner class pertama
     private class Mobil {
         private String merk = "SUZUKI";
         private float kecepatan = 360.0f;
         private void jalankan(){
             System.out.println("Merk Mobil :" + merk);
             System.out.println("Kecepatan Mobil: " +kecepatan);
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
         //membuat Instance dari KelasLuar
         KelasLuar outerclass = new KelasLuar();
         
         //membuat instance dari kelas dalam (mobil)
         KelasLuar.Mobil data1 = outerclass.new Mobil();
         
         //membuat instance dari kelas dalam (pengguna)
         KelasLuar.pengguna data2 = outerclass.new pengguna();
         
         //menampilkan hasil output
         System.out.println("=====DATA DARI CLASS MOBIL=====");
         data1.jalankan();
         System.out.println("===== DATA DARI PENGGUNA=====");
         data2.identitas();
     }
   }
