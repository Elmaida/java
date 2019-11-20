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
public class Persegi extends main {
    public void Persegi (){
        double sp, lp, kp;
        Scanner c = new Scanner (System.in);
        System.out.println ("Persegi");
        System.out.println ("--------");
        System.out.println ("Masukkan sisi: ");
        sp = c.nextDouble();
        lp = sp * sp;
        kp = 4 * sp;
        System.out.println ("Luas Persegi = " +lp);
        System.out.println ("Keliling Persegi = "+ kp);
        
    }
    
}
