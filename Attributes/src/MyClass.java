/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr
 */
public class MyClass {
  int x = 5;
    
    public static void main (String[]args){
        MyClass myObj1 = new MyClass();
        MyClass myObj2 = new MyClass();
        myObj2.x = 25; 
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
   
    }

}
