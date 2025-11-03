/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasukl1.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class TUGASUKL1JAVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        double biayaBerat = berat * biayaPerKg;
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }
        double totalBiaya = biayaBerat + biayaVolume;
        System.out.println("\n=== Rincian Biaya Pengiriman ===");
        System.out.println("Volume paket : " + volume + " cm^3");
        System.out.println("Biaya berat  : Rp " + biayaBerat);
        System.out.println("Biaya volume : Rp " + biayaVolume);
        System.out.println("------------------------------");
        System.out.println("Total biaya  : Rp " + totalBiaya);
    }
}
