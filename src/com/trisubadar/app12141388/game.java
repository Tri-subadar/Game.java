/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trisubadar.app12141388;


/**
 *
 * @author user
 */
 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 *  public static void main(String[] args) {
       
         
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in); 
        Random angkaRandom=new Random(); 
        String cariY; 
 * @author user
 */

public class game {
    public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>(); 
        ArrayList <Integer> sekorPermainan = new ArrayList<>(); 
        /*
        System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=angkaRandom.nextInt(Pang); 
                    for(Kout=0;Kout<=5;Kout++){
        */
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in); 
        Random angkaRandom=new Random(); 
        String cariY; 
        do{
            System.out.println("Masukkan 'Nama' atau tekan 'y' untuk keluar,tekan enter = ");
            cariY=input.nextLine();
            /*
            else if(Kout==1){
             
            */
            namaPemain.add(cariY);
            int NilaiJalan = 0; 
            int CekGameOver=0;
            
            int aKumulasi[]= new int[6];
            int NilaiPasJalan=0;
            
            if(!("y").equals(cariY)){  
              
                String nextLevel;
                int PiLevel=1;   
                System.out.println("Selamat Datang " + cariY); 
                do{
                    int Kout, Ang, Pang;
                    System.out.println("# Level " + PiLevel);
                    int StarNilaiO=PiLevel-1;    
                    Pang=PiLevel*100; 
                    /*System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=angkaRandom.nextInt(Pang); 
                    for(Kout=0;Kout<=5;Kout++){
                    
                    */
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    System.out.println(" mempunyai kesempatan menebak 5 kali.");
                    /*
                    System.out.println("Silahkan );
                    System.out.println(
                    
                    */
                    int AngKaAcak=angkaRandom.nextInt(Pang); 
                    for(Kout=0;Kout<=5;Kout++){
                        if(Kout==5){ 
                            System.out.println("GAMEOVER! Gagal");
                            CekGameOver++; 
                        }
                        else{  
                            System.out.println("Tebakan Anda ? " + AngKaAcak);
                            int AkuTeb=input2.nextInt(); 
                            int Kurang=4-Kout;
                            if(AkuTeb==AngKaAcak){
                                if(Kout==0){
                                    NilaiPasJalan=PiLevel*100; 
                                     }
                                /*
                                System.out.println("Anda mempunyai kesempatan menebak 5 kali.")
                                else if(Kout==1){
                                    NilaiPasJalan=PiLevel*70; 
                                        }
                   
      
                                */
                                    else if(Kout==1){
                                    NilaiPasJalan=PiLevel*70; 
                                        }
                                     else if(Kout==2){
                                    NilaiPasJalan=PiLevel*50; 
                                     }
                                     /*
                                     System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=angkaRandom.nextInt(Pang); 
                    for(Kout=0;Kout<=5;Kout++){
                                     */
                                     else if(Kout==3){
                                    NilaiPasJalan=PiLevel*30; 
                                    }
                                    else{
                                    NilaiPasJalan=0; 
                                     }
                                
                                int NeTebak=Kout+1;
                        
                                System.out.println("Anda berhasil menebak dalam " + NeTebak + " kali tebakan. Sekor " + NilaiPasJalan);
                                break;

                            }
                            
}
