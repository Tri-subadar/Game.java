
import java.util.Scanner;

public class bintang2 {
    public static void main(String [] args){
        int panjang ;
        Scanner input = new Scanner(System.in);
        System.out.println("Tentukan panjang karakter : ");
        panjang = input.nextInt();
        
        for (int i=1;i<=panjang;i++){
            for(int j=panjang;j>=i;j--){ //spasi
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ //bintang
                System.out.print("i");
            }
            
        }
        
    }
}
