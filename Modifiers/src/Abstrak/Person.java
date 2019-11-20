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
public class Person {
    // Code from filename: Person.java
// abstract class
abstract class Person {
  public String fname = "Elmaida";
  public String lname = "Khoirotuzzuhria";
  public String email = "elmaidak457@gmail.com";
  public int age = 19;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
}
// End code from filename: Person.java

// Code from filename: Person.java



