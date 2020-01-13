import java.io.Console;

public class Kasus_Console {
    
public static void main (String[]args) {
    
    Console input = System.console();
    
    //input
    System.out.print ("Nama: ");
    String nama = input.readLine();
    
    System.out.print ("Umur: ");
    int umur = Integer.parseInt(input.readLine());
    
    //output
    System.out.println ("Nama mu adalah: " + nama);
    System.out.println ("Umur mu " + umur + "Tahun");
}    
}
