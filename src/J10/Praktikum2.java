package J10;
import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int[] angka = new int[6];
        
        for (int i = 0; i < angka.length; i++) 
        {
            System.out.print("Masukan angka : ");
            angka[i] = baca.nextInt();
        }
        {
            System.out.print("BILANGAN GANJIL : ");
        }
        for (int i = 0; i < angka.length; i++) 
        {
            if (angka [i] % 2 == 1)
            {
                System.out.print(angka[i] + " ");
            }    
        }
        System.out.println("");
        System.out.print("BILANGAN GENAP : ");
        for (int i = 0; i < angka.length; i++) {
            {
            if(angka[i] % 2 == 0)
            {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.print("");
        }
    }
}

    

