/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr
 */
//package yang dibutuhkan untuk membuat class scanner
import java.util.*;

public class MyClass {
public static void main (String[]args) {
    Scanner input = new Scanner (System.in); // membuat objek dari C
    String nama; //variabel String, untuk menyimpan input dari user
    System.out.println ("Siapa nama kamu: ");
    nama= input.nextLine(); //mendapatkan input dari user
    System.out.println ("Nama saya: " + nama); //mencetak output
}    
}
    

