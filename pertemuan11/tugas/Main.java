package id.ac.stmikamikbdg.tugas;

import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        
        int n = 0;
        do {            
            System.out.println("===============================================");        
            System.out.println("Pilih (pilih 0 untuk keluar) : ");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.print("Pilihan anda : ");
            n = input.nextInt();
            
            switch(n) {
                case 1:
                    System.out.println("\nInput Data");
                    input();
                break;
                case 2:
                    System.out.println("\nBaca Data");
                    baca();
                break;
                default:
                    System.out.println("\ninputan salah \naplikasi dikeluarkan");
                    n = 0;
            }
        } while (n != 0);
    }
    
    public static void input() throws IOException{
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("BukuAlamat.dat", true);  
        BufferedWriter buffer = new BufferedWriter(writer);
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine().replace(' ', '-');

        System.out.print("Masukkan No. HP : ");
        String telp = input.nextLine().replace(' ', '-');
                    
        buffer.newLine();
        buffer.write(nama + ";" + alamat + ";" + telp);
        buffer.close();
        System.out.println("Success");
    }
    
    public static void baca() throws FileNotFoundException, IOException {
        System.out.println("=======================================\n");
        System.out.println("Baca File : ");
        System.out.println("=======================================");
        System.out.println("Nama - Alamat - No. Telp");
        BufferedReader reader = new BufferedReader(new FileReader("BukuAlamat.dat"));
        String baca = reader.readLine();
        while (baca != null) {
            System.out.println(baca.replace(';', '-'));
            baca = reader.readLine();
        }
    }
}
