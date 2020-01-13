/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_kasus;

/**
 *
 * @author Mr
 */
public class ProgramJava {
    public static void main (String[]args) {
        System.out.println ("awal program");
        int x = 10;
        
        try{
        x = x / 0;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println ("error karena pembagian nol");
        } 
        finally{
        System.out.println(x);
        }
        System.out.println("akhir program");
    }
}
