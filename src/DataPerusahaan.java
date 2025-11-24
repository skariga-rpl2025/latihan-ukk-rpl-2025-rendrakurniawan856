/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
public class DataPerusahaan {
    public static void main(String[] args) {
        
        // Membuat object dari class Karyawan
        Karyawan k = new Karyawan();
        
        // Mengisi data menggunakan setter
        k.setNip("K001");
        k.setNama("Budi Hartono");
        k.setDivisi("Marketing");
        
        // Menampilkan data menggunakan getter
        System.out.println("===== DATA KARYAWAN =====");
        System.out.println("NIP     : " + k.getNip());
        System.out.println("Nama    : " + k.getNama());
        System.out.println("Divisi  : " + k.getDivisi());
    }
}

