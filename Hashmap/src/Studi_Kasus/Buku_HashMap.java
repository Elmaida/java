/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;
import java.util.HashMap;
import java.util.Map;

public class Buku_HashMap {
    public static void main (String[]args) {
        //membuat object hashmap
        HashMap<String, Buku> books = new HashMap <String, Buku>();
        
        //membuat object buku
        Buku bukuJava = new Buku ("Tutorial Java", "Elmaida");
        Buku bukuKotlin = new Buku ("Pemrograman kotlin", "Elmaida");
        Buku bukuAndroid = new Buku ("Pemrograman Android", "Elmaida");
        
        //mengisi object hashmap dengan object  buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put ("Android", bukuAndroid);
        
        //memcetak semua buku
        for (Map.Entry b: books.entrySet()){
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        } }}
