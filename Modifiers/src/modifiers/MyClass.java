/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifiers;



/**
 *
 * @author Mr
 */
public class MyClass {
// MyClass method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
// Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
// Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
} 