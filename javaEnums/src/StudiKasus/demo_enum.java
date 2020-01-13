/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author LENOVO
 */
public class demo_enum {
   
    
    //Membuat Class Enum serta Beberapa Variable Didalamnya
    public enum Zodiak{
        CAPRICON, AQUARIUS, LEO, SAGITARIUS, ARIES, TAURUS, VIRGO, LIBRA;
    }
    
    //Membuat Objek dari Enum
    private Zodiak zodiak;
    
    //Sebuah Konstruktor dengan Parameter Enum
    public demo_enum(Zodiak zodiak){
        this.zodiak = zodiak;
    }
    
    //Mendefinisikan Nilai pada Masing-Masing Variable Enum
    void DaftarZodiak(){
        //Method Switch Digunakan Untuk Menentukan Opsi Mana Yang Akan Dipilih
        switch(zodiak){
            case AQUARIUS:
                System.out.println("AQUARIUS: 21 Januari - 19 Februari");
                break;
            case ARIES:
                System.out.println("ARIES: 21 Maret-19 April");
                break;
            case CAPRICON:
                System.out.println("CAPRICON: 22 Desember - 20 Januari");
                break;
            case LIBRA:
                System.out.println("LIBRA: 23 September-23 Oktober");
                break;
            case LEO:
                System.out.println("LEO: 23 Juli-23 Agustus");
                break;
            case SAGITARIUS:
                System.out.println("SAGITARIUS: 23 November-21 Desember");
                break;
            case TAURUS:
                System.out.println("TAURUS: 21 April-20 Mei");
                break;
            case VIRGO:
                System.out.println("VIRGO: 24 Agustus-22 September");
                break;
        }
    }
    
    public static void main(String[] args){
        //Membuat Instance/Objek Serta Menentukan Variable/Opsi Mana Yang Akan Dipilih
        demo_enum data1 = new demo_enum(Zodiak.ARIES);
        data1.DaftarZodiak();
        
        demo_enum data2 = new demo_enum(Zodiak.AQUARIUS);
        data2.DaftarZodiak();
        
        demo_enum data3 = new demo_enum(Zodiak.LEO);
        data3.DaftarZodiak();
        
        demo_enum data4 = new demo_enum(Zodiak.TAURUS);
        data4.DaftarZodiak();
        
        demo_enum data5 = new demo_enum(Zodiak.VIRGO);
        data5.DaftarZodiak();
    }
}

