/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi_kasus;

/**
 *
 * @author Mr
 */
class Rumus {
  
   protected String persegi = "Persegi";
   protected String p_panjang = "Persegi Panjang";
   protected String segitiga = "segitiga";
   protected String lingkaran = "Lingkaran";
   
   public void honk(){
   System.out.println ("Rumus Luas Bangun Datar");
   }
   }

class Rumus extends Bangun_datar{
    private String modelPersegi = "Sisi X Sisi";
    private String modelP_Panjang = "Panjang X Lebar";
    private String modelSegitiga = "1/2 X alas X tinggi";
    private String modellingkaran = "phi X r X r";
    
    
}

