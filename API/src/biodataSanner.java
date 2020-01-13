//Package yang dibutuhkan untuk memuat class scanner
import java.util.Scanner;

public class biodataSanner {
    public static void main (String []args){
        Scanner input = new Scanner(System.in); //membuat objek dari C
        
        String nama;
        Long nim;
        String alamat;
        String jurusan;
        int TahunAngkatan;
        String jeniskelamin;
         
        System.out.print("Masukkan Nama            : ");
         nama= input.next();
        
        System.out.print("Masukkan Nim             : ");
         nim = input.nextLong();
        
        System.out.print("Masukkan Alamat          : ");
        alamat =  input.next();
        
        System.out.print("Masukkan Jurusan         : ");
        jurusan = input.next();
         
        System.out.print("Masukkan Tahun Angkatan  : ");
        TahunAngkatan = input.nextInt();
        
        System.out.print("Masukkan Jenis Kelamin   : ");
        jeniskelamin= input.next();
        
        
        
        System.out.println("    ");
        System.out.println("   Biodata Mahasiswa ");
        System.out.println("Nama            : " + nama);
        System.out.println("Nim             : " + nim);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("Tahun Angkatan  : " + TahunAngkatan);
        System.out.println("Jenis Kelamin   : " + jeniskelamin);
       
    }}
