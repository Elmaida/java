/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getandset;

/**
 *
 * @author ATIK
 */
public class Person { // private = restricted access
    public String name;
    
    //getter
    public String getName(){
        return name;
    }
    
    //setter
    public void setName(String newName) {
    this.name = newName;
    }
    
}
