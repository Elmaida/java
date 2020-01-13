/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers;

/**
 *
 * @author RIFQIYAH
 */
public class Public2 {
  public String fname = "Rifqiyah";
  public String lname = "Cece";
  public String email = "Rifqiyah07@gmail.com";
  public int age = 20;
}
class MyClass {
public static void main(String[] args) {
    Public2 myObj = new Public2(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
