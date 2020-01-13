/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author Mr
 */
public class Static {
    //class dalam/inner class static
    private static class Programming{
        private String language;
        private void setLanguage(String language){
            this.language = language;
        }
        private String getLanguage(){
            return language;
        }
    }
    
    public static void main (String []args) {
        // membuat instance dari kelas dalam (Programming)
       Static.Programming MyLanguage = new Static.Programming();
        
        //memasukkan Nilai/Value
        MyLanguage.setLanguage("BTS");
        
        //menampilkan hasil output
        System.out.println("Idola saya adalah : " + MyLanguage.getLanguage());
    }
    
}
