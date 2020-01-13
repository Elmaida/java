
package inheritance;
import java.util.*;

public class main {
        
    public static void main (String[]args){
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga();
        Persegi B = new Persegi ();
        PersegiPanjang P = new PersegiPanjang();
        
        Scanner inp = new Scanner (System.in);
        System.out.println("Menu Perhitungan Keliling dan Luas Bangun Datar");
        System.out.println ("---------------------------------------------");
        System.out.println ("1. Lingkaran");
        System.out.println ("2. Segitiga");
        System.out.println ("3. Persegi");
        System.out.println ("4. Persegi Panjang");
        System.out.println ("5. Exit");
        System.out.println ("Pilihan :  ");
        pil = inp.nextInt();
        
        switch (pil){
            case 1 : L.Lingkaran (); break;
            case 2 : S.Segitiga (); break;
            case 3 : B.Persegi (); break;
            case 4 : P.PersegiPanjang(); break;
            case 5 : System.exit(0);
    }
    }
    
}

