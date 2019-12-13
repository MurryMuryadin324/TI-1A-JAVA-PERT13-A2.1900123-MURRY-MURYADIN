/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.tutorial;

import java.util.Scanner;

/**
 *
 * @author Muryy
 * 
 * Nama     : Murry Muryadin
 * Kelas    : TI-1A
 * Nim      : A2.1900123
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
    
}
