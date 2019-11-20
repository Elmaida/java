/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Mr
 */
public class car {
    final class Vehicle {
        protected String brand = "Ford";
        public void honk(){
            System.out.println("Tuut, tuut");
        }
    }
    class car extends Vehicle{
        private String modelName = "Mustang";
        
        public static void main (String[]args){
            car myFastCar = new car;
            myFastCar.honk();
            System.out.println(MyFastCar.brand + " " + myFastCar.modelName);
        }
    }
}
 
