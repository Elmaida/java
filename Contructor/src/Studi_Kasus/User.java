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
public class User {
    public String Negara;
    public String IbuKota;
    
    public User (String Negara, String IbuKota){
        this.Negara = Negara;
        this.IbuKota= IbuKota;
    } }
class DemoConstructor {
    public static void main (String[]args){
        User Elma = new User ("Indonesia", "jakarta");
        System.out.println ("Negara: " + Elma.Negara);
        System.out.println ("Ibu Kota: "+ Elma.IbuKota);
    }
}
