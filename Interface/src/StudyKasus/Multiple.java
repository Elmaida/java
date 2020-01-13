/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author Mr
 */
interface FirstInterface {
  public void myOther(); // interface method
}

interface SecondInterface {
  public void myOtherClass(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myOther() {
    System.out.println("Jungkook is perfect man ");
  }
  public void myOtherClass() {
    System.out.println("Some other text is some perfect man in BTS");
  }
}

class Multiple {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myOther();
    myObj.myOtherClass();
  }
}
 