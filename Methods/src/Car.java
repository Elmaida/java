/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr
 */
public class Car {
    
    //create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The Car is going as fast  as it can!");
    }
    //create a speed() method and add a parameter
    public void speed (int maxSpeed){
        System.out.println("max Speed is: " + maxSpeed);
    }
    // inside main, ca; the methods on the car objects
    public static void main (String[]args){
        Car myCar = new Car(); //create a myCar objects
        myCar.fullThrottle();  //call the fulThrottle() method
        myCar.speed(200);      //call the speed() method
    }
}
//the car is going as fast as it can!
//mas Speed is: 200
