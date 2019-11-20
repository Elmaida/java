/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author Mr
 */
public class PersegiPanjang extends main {
    public void PersegiPanjang(){
        double pb, leb, lb, kb;
        Scanner d = new Scanner (System.in);
        System.out.println ("Persegi Panjang");
        System.out.println  ("----------------");
        System.out.println ("Masukkan Panjang = ");
        pb = d.nextDouble();
        System.out.println ("Masukkan lebar = ");
        leb =  d.nextDouble();
        lb = pb*leb;
        kb = (2*pb) + (2*leb);
        System.out.println ("Luas Persegi Panjang = " + lb);
        System.out.println ("keliling Persegi Panjang = " + kb);
        
    }
    
}
