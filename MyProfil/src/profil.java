/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr
 */
public class profil {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelTahunAngkatan;
    
public profil (long Nim, String Nama, String Alamat, String Jurusan, int TahunAngkatan) {  
    modelNim = Nim;
    modelNama = Nama;
    modelAlamat = Alamat;
    modelJurusan = Jurusan;
    modelTahunAngkatan = TahunAngkatan;
    }

public static void main (String[] args) {
   profil myprofil = new profil (201869040003L, "Elmaida Khoirotuzzuria", "Baujeng-Pandaan", "Teknik Informatika", 2018);
   System.out.println ("Nim             : " + myprofil.modelNim );
   System.out.println ("Nama            : " + myprofil.modelNama );
   System.out.println ("Alamat          : " + myprofil.modelAlamat );
   System.out.println ("Jurusan         : " +myprofil.modelJurusan );
   System.out.println ("Tahun Angkatan  : " +myprofil.modelTahunAngkatan );
    
}
}
