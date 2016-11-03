
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class segitiga_terbalik_kiri {
    public static void main (String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.println("Masukkan panjang karakter : ");
        int panjang = input.nextInt();
        
        for (int i=0;i<=panjang;i++){
            for(int j=panjang;j>=i;j--){
                System.out.print("j");
            }
               
        }
    }
    
}