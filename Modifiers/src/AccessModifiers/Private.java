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
public class Private {
    private String fname = "Rifqiyah";
  private String lname = "Cece";
  private String email = "rifqiyah07@gmail.com";
  private int age = 20;
  
  public static void main(String[] args) {
    Private myObj = new Private();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

