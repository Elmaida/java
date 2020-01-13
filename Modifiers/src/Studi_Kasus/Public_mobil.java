/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studi_Kasus;

/**
 *
 * @author Mr
 */
public class Public_mobil {
    public String merk;
    public double speed;
    
    public void setMerk (String merk){
        this.merk = merk;
    }
   public void setSpeed(int speed){
       this.speed = speed;
   }
   public String getMerk(){
       return merk;
   }
   public double getSpeed(){
       return speed;
   }
   public static void main (String []args){
       Public_mobil myObj = new Public_mobil();
       myObj.setMerk("Yamaha");
       myObj.setSpeed(150);
       System.out.println ("Saya mempunyai motor dengan merk: " + myObj.getMerk());
       System.out.println ("dengan kecepatan: " + myObj.getSpeed());
   }
}
 
