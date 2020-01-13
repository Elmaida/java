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
public class programming {
    private String language =  "java";
    public String getLanguage(){
        return language;
    }
    }
public class latihan extends programming {
    public static void main (String[]args){
        latihan myObj = new latihan();
        System.out.println ("Bahasa pemrograman: " + myObj.getLanguage());
    }
    
}

