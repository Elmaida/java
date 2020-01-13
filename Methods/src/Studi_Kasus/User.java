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
class User {
    private String username;
    private String password;
    
    //method setter
    public void setusername(String username){
        this.username = username;
        }
    public void setPassword(String password){
        this.password = password;
    }
    //method getter
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public static void main (String[]args){
        User Elma = new User();
        //menggunakan method setter
        Elma.setusername("Elma");
        Elma.setPassword("mahasiswa_teknik");
        //menggunakan method getter
        System.out.println("Username: " + Elma.getUsername());
        System.out.println("Password: " + Elma.getPassword());
    }
    }
