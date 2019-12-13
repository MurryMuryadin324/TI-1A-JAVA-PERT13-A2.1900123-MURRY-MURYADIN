/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28.tutorial;

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
        
        //        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
    
}
