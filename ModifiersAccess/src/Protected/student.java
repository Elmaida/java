/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protected;

/**
 *
 * @author Mr
 */

   class Person {
  protected String fname = "Elmaida";
  protected String lname = "Khoirotuzzuhria";
  protected String email = "elmaidak457@gmail.com";
  protected int age = 19;
}

class student extends Person {
  private int graduationyear = 2018;
  
  public static void main(String[] args) {
    student myObj = new student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationyear);
}

    
}
