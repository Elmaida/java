/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_datar;

/**
 *
 * @author Mr
 */
class bangundatar {
   protected String persegi = "Persegi";
   protected String p_panjang = "Persegi Panjang";
   protected String segitiga = "segitiga";
   protected String lingkaran = "Lingkaran";
   
   public void honk(){
   System.out.println ("Rumus Luas Bangun Datar");
   }
   }

class bangun_datar extends bangundatar{
    private String modelPersegi = "Sisi X Sisi";
    private String modelP_Panjang = "Panjang X Lebar";
    private String modelSegitiga = "1/2 X alas X tinggi";
    private String modellingkaran = "phi X r X r";
    
public static void main (String [] args ){
    bangun_datar myLuas=  new bangun_datar();
    myLuas.honk();
    
    System.out.println(myLuas.persegi + " " + " = " + myLuas.modelPersegi);
    System.out.println(myLuas.p_panjang + " " + " = " + myLuas.modelP_Panjang);
    System.out.println (myLuas.segitiga + " " + " = " + myLuas.modelSegitiga);
    System.out.println (myLuas.lingkaran + " " + "= " + myLuas.modellingkaran);
}
}
