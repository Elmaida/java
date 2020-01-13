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
   //static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    
    //public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    
    //main method
    public static void main (String[]args){
        myStaticMethod(); //untuk memanggil static method
        //myPublicMethod(0;  ini akan terjadi kesalahan
        
        MyClass myObj =  new MyClass();//untuk membuat object dari MyClass
        myObj.myPublicMethod();//untuk memanggil public method dalam object
                
    }
   }
