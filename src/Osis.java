/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.util.Scanner;

public class Osis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("===== PROGRAM VOTING OSIS =====");
        System.out.println("(Ketik 'selesai' untuk mengakhiri)\n");

        do {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (pilihan.equalsIgnoreCase("B")) {
                suaraB++;
            } else if (!pilihan.equalsIgnoreCase("selesai")) {
                System.out.println("Input tidak valid! Masukkan A, B, atau 'selesai'.");
            }

        } while (!pilihan.equalsIgnoreCase("selesai"));

        System.out.println("\n-----------------------------");
        System.out.println("HASIL HITUNG CEPAT:");
        System.out.println("Total Suara Kandidat A: " + suaraA);
        System.out.println("Total Suara Kandidat B: " + suaraB);
    }
}
