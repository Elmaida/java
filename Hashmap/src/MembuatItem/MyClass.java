
package MembuatItem;

import java.util.HashMap;

public class MyClass {
    public static void main (String[]args ){
        //membuat object HashMap bernama capitalCities
        HashMap<String, String> capitalCities = new HashMap <String, String>();
        
       //menambahkan kunci dan nilai (Country, City)
       capitalCities.put("England", " London");
       capitalCities.put("Germany", " Berlin");
       capitalCities.put("Norway", " Oslo");
       capitalCities.put ("USA", " Washington");
       System.out.println(capitalCities);
       

    } }
