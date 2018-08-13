/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int[] nama = new int[5];
        double total = 0;
        
        for (int i = 0; i <= 4; i++) 
        {
            System.out.print("Masukan angka: ");
            nama[i] = baca.nextInt();
        }
        for (int i = 0; i < nama.length; i++)       
        {
            total += nama[5];
        }      
        System.out.println("Nilai total: " + total);
        System.out.println("RATA - RATA: " + total/5);
    }
}
    
    

