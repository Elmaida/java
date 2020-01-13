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
public class SuaraHewan {
    public static void main (String []args){
        Hewan HEWAN = new Hewan();
        Kuda KUDA = new Kuda ();
        Kucing KUCING = new Kucing ();
        Ayam AYAM = new Ayam ();
        
        HEWAN.suara ();
        
        HEWAN = KUDA ;
        HEWAN.suara ();
        
        HEWAN = KUCING;
        HEWAN.suara ();
        
        HEWAN = AYAM;
        HEWAN.suara ();
    }
   }
