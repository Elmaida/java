/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author Mr
 */
public class percobaan {
    public void vehicleSound (){
     System.out.println (" The different vehicle sound");
    }
    }
class car extends percobaan {
     public void vehicleSound () {
         System.out.println (" Car sounds are : Teet Teet !!!");
     }
}
class bike extends percobaan {
    public void vehicleSound (){
        System.out.println (" Bike sounds are : Kriing Kriing !!!");
       
    }
}
class cycle extends percobaan {
public void vehicleSound () {
    System.out.println (" Cycle sounds are : Tiin Tiin !!!");
    
}
}
class MyMainClass {
    public static void main (String [] args ) {
        percobaan mypercobaan = new percobaan ();
        percobaan mycar = new car ();
        percobaan  mybike = new bike ();
        percobaan mycycle = new cycle();
        
        mypercobaan.vehicleSound();
        mycar.vehicleSound();
        mybike.vehicleSound();
        mycycle.vehicleSound();
}
}