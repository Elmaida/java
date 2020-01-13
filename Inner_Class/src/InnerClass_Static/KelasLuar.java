/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass_Static;

//Outer class/ kelas luar 
public class KelasLuar {
    
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
        KelasLuar.Programming MyLanguage = new KelasLuar.Programming();
        
        //memasukkan Nilai/Value
        MyLanguage.setLanguage("java");
        
        //menampilkan hasil output
        System.out.println("Saya sedang mempelajari: " + MyLanguage.getLanguage());
    }
    
}
