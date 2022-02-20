import javax.swing.JOptionPane;

public class JavaLibs5026211035 {
  public static void main(String[] Args) {
   String nama = null;
   String gender = null;
   String makanan = null;
   int tinggi, kolesterol, massa, lemak;
   double berat, kalori; 
   

   nama = JOptionPane.showInputDialog(null,"Nama Lengkap:");
   gender = JOptionPane.showInputDialog(null,"Gender:");
   makanan = JOptionPane.showInputDialog(null,"Pengen makan apa:"); 
   berat = Double.parseDouble(JOptionPane.showInputDialog(null,"Berapa berat badanmu!"));
   kalori = berat*45/100;

  
   
   tinggi = Integer.parseInt(JOptionPane.showInputDialog(null,"Oh iya, berapa sih tinggi dan massa tubuhmu"));

		
   
   JOptionPane.showInputDialog(null,"Aku juga kepo nih sama kolesterol dan lemak tubuhmu?"); 

		

   JOptionPane.showMessageDialog(null,"Wahhh, berapa nih berat badan idealmu?");



      }
}
   

   
   
   
   
   