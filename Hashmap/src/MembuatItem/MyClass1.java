/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MembuatItem;

import java.util.HashMap;

public class MyClass1 {
public static void main (String []args) {
    // create a hashmap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer> ();
    
    //add keys and value (name, age)
    people.put("John", 32);
    people.put ("Steve", 30);
    people.put("Angle",33);
    
    for (String i : people.keySet()){
        System.out.println("key: " + i + " value: " + people.get(i));
    }
}   
}
