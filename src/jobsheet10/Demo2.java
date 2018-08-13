
package jobsheet10;
import java.util.Scanner;
public class Demo2 {
   public static void main(String[] args)
   {
       Scanner baca = new Scanner(System.in);
       String[] nama = new String[5];
       
       //LOOPING FOR UNTUK INPUT ELEMEN NAMA
       
       //LOOPING FOR UNTUK MENAMPILKAN ELEMEN NAMA
           
       for (int a = 0; a <= 4; a++)
       {
           System.out.print("MASUKAN NAMA SISWA KE- " + (a+1) + " : ");
           nama[a] = baca.nextLine();
       }
       System.out.println("");
       for (int a = 0; a < nama.length; a++)
       {
           System.out.println("SISWA- " + (a+1) + " : " + nama[a]);
       }
       }
   }    

