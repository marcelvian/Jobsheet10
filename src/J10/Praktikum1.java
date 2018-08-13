package J10;
import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(
                System.in);
        String[] siswa ={" Deanne"," Victoria"," Nathalie"," Pamela"," Armand"," Omar","Alvaro"," Ben"," Danny"};
        String x,y = "";
        System.out.print("Mencari siapa???");
        x = baca.nextLine();
        for (int a = 0; a < siswa.length; a++)
        {
            if(x.equals(siswa[a]))
            {
                y = siswa[a];
            } 
        }
            if(y.equals(x))
            {
                System.out.println("Data ditemukan");
            }
            else
            {
                System.out.println("Data tidak ditemukan");
            }
    }
}
