/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrak;

/**
 *
 * @author Mr
 */

    
class MyClass {
public static void main (String[]args ){
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student  myObj = new Student ();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
    

