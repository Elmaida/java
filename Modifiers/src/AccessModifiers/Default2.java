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
public class Default2 {
    String fname = "Rifqiyah";
  String lname = "Cece";
  String email = "Rifqiyah07@gmail.com";
  int age = 20;
  
  public static void main(String[] args) {
    Default2 myObj = new Default2();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
