/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyobak;

/**
 *
 * @author Mr
 */
 class Bangun_datar {
     
   protected String persegi = "Persegi";
   protected String p_panjang = "Persegi Panjang";
   protected String segitiga = "segitiga";
   protected String lingkaran = "Lingkaran";
   
   public void honk(){
   System.out.println ("Nama Bangun Datar");
   System.out.println ("-------------------------");
   
   System.out.println(myLuas.persegi + " " );
    System.out.println(myLuas.p_panjang + " " );
    System.out.println (myLuas.segitiga + " ");
    System.out.println (myLuas.lingkaran + " ");
   }
   }

class bangun extends Bangun_datar{
    private String modelPersegi = "Sisi X Sisi";
    private String modelP_Panjang = "Panjang X Lebar";
    private String modelSegitiga = "1/2 X alas X tinggi";
    private String modellingkaran = "phi X r X r";
    
public static void main (String [] args ){
    Bangun_datar myLuas=  new Bangun_datar();
    myLuas.honk();
    
    
    
   System.out.println (" ");
   System.out.println ("Rumus");
   System.out.println(myLuas.persegi + " " + " = " + myLuas.modelPersegi);
   System.out.println(myLuas.p_panjang + " " + " = " + myLuas.modelP_Panjang);
   System.out.println (myLuas.segitiga + " " + " = " + myLuas.modelSegitiga);
   System.out.println (myLuas.lingkaran + " " + "= " + myLuas.modellingkaran);

}
}

   
 
