/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Private;

/**
 *
 * @author Mr
 */
public class person {
  private String fname = "Elmaida";
  private String lname = "Khoirotuzzuhria";
  private String email = "elmaidak457@gmail.com";
  private int age = 24;
  
  public static void main(String[] args) {
    person myObj = new person();
    System.out.println("Name   : " + myObj.fname + " " + myObj.lname);
    System.out.println("Email  : " + myObj.email);
    System.out.println("Age    : " + myObj.age);
  }
}
    

