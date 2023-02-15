/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentalsepedamotor;

import java.util.Scanner;

/**
 *
 * @author Kelompok 3
 */
public class MainRental {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Motor[] daftar = new Motor[3];
    daftar[0] = new Matik("Beat", "Honda", 300000);
    daftar[1] = new Bebek("Vega R", "Yamaha", 200000);
    daftar[2] = new Sport("CRF 250", "Honda", 350000);
           System.out.println("### PROGRAM RENTAL MOTOR - KELOMPOK 3 ### \n");
        System.out.println("RENTAL SEPEDA MOTOR READY : \n");
        for (int i = 0; i < daftar.length; i++) {
         System.out.println("MOTOR " + (i + 1));
         daftar[i].info();
         System.out.println();
         
        }

        System.out.print("Masukkan motor (1/2/3) yang disewa = ");
        int pilihan = input.nextInt();
        System.out.println("Selamat Anda Berhasil Order MOTOR : ");
        daftar[pilihan - 1].info();
        
    }
}