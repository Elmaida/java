/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.*;


/**
 *
 * @author Mr
 */
public class Segitiga extends main {
    public void Segitiga() {
        double ls, as, ts, ss, ks;
        Scanner a =  new Scanner (System.in);
        System.out.println ("Segitiga");
        System.out.println ("---------");
        System.out.println("Masukkan alas = ");
        as = a.nextDouble();
        System.out.println ("Masukkan tinggi = ");
        ts = a.nextDouble();
        System.out.println ("Masukkan sisi = ");
        ss = a.nextDouble();
        ls = (as*ts)/2;
        ks = (ss*2)+as;
        System.out.println ("Luas Segitiga = " +ls);
        System.out.println("keiling Segitiga = "+ks);
        
    }
    
}
