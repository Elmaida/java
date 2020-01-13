import java.io.*;

public class biodataBufferReader {
    public static void main (String[]args){
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        
       String nama;
       String nim;
       String alamat;
       String jurusan;
       String TahunAngkatan;
       String jeniskelamin;
       
       try{
       
      
        
     System.out.print("Masukkan Nama            : ");
         nama= input.readLine();
        
       System.out.print("Masukkan Nim             : ");
       nim = input.readLine();
         
        
        System.out.print("Masukkan Alamat          : ");
        alamat =  input.readLine();
        
        System.out.print("Masukkan Jurusan         : ");
        jurusan = input.readLine();
         
        System.out.print("Masukkan Tahun Angkatan  : ");
        TahunAngkatan = input.readLine();
        
        System.out.print("Masukkan Jenis Kelamin   : ");
        jeniskelamin= input.readLine();
        
        System.out.println("Nama            : " + nama);
        System.out.println ("Nim            : " + nim);
        System.out.println("Alamat          : " + alamat);
        System.out.println ("Jurusan        : " + jurusan);
        System.out.println("Tahun Angkatan  : " + TahunAngkatan);
        System.out.println("Jenis Kelamin   : " + jeniskelamin);
        
         
    }catch (IOException ex){
        //jika terdapat kesalahan saat menginputkan data
        System.out.println("Terjadi kesalahan pada input");
    }
    }
}