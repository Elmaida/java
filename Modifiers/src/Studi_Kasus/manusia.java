/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;

/**
 *
 * @author Mr
 */
public class manusia extends Hewan {
    public static void main (String[]args){
        manusia myObj = new manusia ();
        myObj.setHidup(true);
        System.out.println ("Makanan harimau adalah: " + myObj.makanan);
        System.out.println("harimau hidup: " + myObj.getHidup());
    }
}
