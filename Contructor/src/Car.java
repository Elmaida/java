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
   int modelYear;
   String modelName;
   
   public Car (int year, String Name){
       modelYear = year;
       modelName = Name;
   }
   public static void main (String []args) {
       Car myCar =  new Car (1969, "Mustang");
       System.out.println (myCar.modelYear + " " + myCar.modelName);
}
}

//output 1969 Mustang
