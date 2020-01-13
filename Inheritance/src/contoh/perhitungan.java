/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;
import java.util.Scanner;
/**
 *
 * @author Mr
 */
public class perhitungan {
    public static void main (String[]args){
     Integer bilInt;
     boolean ulang = true;
     double phi = 3.14;
     double hasil;
     
     String Menu,A="persegi", B ="persegi panjang", C="lingkaran", D="segitiga";
     
     while( ulang ) {
     
     System.out.println("Program Matematika Menggunakan Switch");
     System.out.println("1."+A+" 2."+B+" 3."+C+" 4."+D+" 5. Keluar Aplikasi");
     System.out.println("=========================================================");
                  
     Scanner input = new Scanner (System.in);
     System.out.println("Pilih Menu : ");
     Menu = input.nextLine();
     if(Menu.equalsIgnoreCase("5")) {break;}
     bilInt = Integer.valueOf(Menu).intValue();
     System.out.print("Input Nilai 1 : ");
     double nilai1 = input.nextDouble();
     System.out.print("input Nilai 2 : ");
     double nilai2 = input.nextDouble();
     
      switch(bilInt){
     case 1:
            hasil = nilai1 * nilai2;
            System.out.println("Luas = Sisi * Sisi ");
            System.out.println( "    = "+ " "+"  " + nilai1+ " * "+ nilai2+ " = "+ hasil);
            break;
                   
     case 2:
            hasil = nilai1 * nilai2;
            System.out.println("Luas = Panjang * Lebar  ");
            System.out.println( "    = " + "  " + nilai1+ " * "+ nilai2+ " = "+ hasil);
            break;
                   
     case 3:
           
            hasil = phi * nilai1*nilai2;
            System.out.println ("Luas = phi * r * r ");
            System.out.println( "     ="+ + phi + nilai1+ " * "+ nilai2+ " = "+ hasil);
            break;
                   
     case 4:
            hasil = (nilai1*nilai2)/2;
            System.out.println (" Luas = 1/2 * alas * tinggi");
            System.out.println( "      = "+ " " + "( "+ nilai1+ " * "+ nilai2+ " )" + "/2 "+ "=" + hasil);
            break;
                        
     default:
            System.out.println("pilih salah satu angka dari 1-5");
     }
            System.out.print(" ");

                  
                   
                 
}
}
  }
     
                 
    

