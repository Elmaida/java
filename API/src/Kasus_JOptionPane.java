import javax.swing.JOptionPane;

public class Kasus_JOptionPane {
    public static void main (String[]args){
        int Luas, sisi;
        sisi = Integer.parseInt (JOptionPane.showInputDialog("Input Nilai Sisi"));
        Luas = sisi * sisi;
        
        JOptionPane.showMessageDialog(null, " Luas Persegi " + Luas);
    }
   }
