/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.util.Scanner;

public class Anggota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String lagi;
        String nama;

        System.out.println("===== PENDAFTARAN ANGGOTA GYM =====\n");

        do {
            // Input nama anggota
            System.out.print("Masukkan nama anggota: ");
            nama = input.nextLine();
            totalAnggota++; // Tambah jumlah anggota

            // Tanya apakah ingin menambah lagi
            System.out.print("Daftar anggota lagi? [ya/tidak] > ");
            lagi = input.nextLine();

            System.out.println();

        } while (lagi.equalsIgnoreCase("ya"));

        // Output total anggota
        System.out.println("-------------------------------");
        System.out.println("Total anggota yang didaftarkan: " + totalAnggota);
    }
}

