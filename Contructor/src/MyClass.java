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
    int x;
    public MyClass (int y){
        x=y;
    }
    public static void main (String []args) {
        MyClass myObj = new MyClass(5);
        System.out.println(myObj.x);
    }
   }

//output 5
