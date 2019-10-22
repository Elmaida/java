/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr
 */
public class profil2 {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelTahunAngkatan;
    
public profil2 () {  
    modelNim = 201869040003L;
    modelNama = "Elmaida Khoirotuzzuhria";
    modelAlamat = "Baujeng-Pandaan";
    modelJurusan = "Teknik Informatika";
    modelTahunAngkatan = 2018;
    }

  public static void main (String[] args) {
   profil2 myprofil2 = new profil2();
   System.out.println ("Nim             : " + myprofil2.modelNim );
   System.out.println ("Nama            : " + myprofil2.modelNama );
   System.out.println ("Alamat          : " + myprofil2.modelAlamat );
   System.out.println ("Jurusan         : " +myprofil2.modelJurusan );
   System.out.println ("Tahun Angkatan  : " +myprofil2.modelTahunAngkatan );
    
}
}
