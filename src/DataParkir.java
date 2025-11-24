/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
public class DataParkir {
    public static void main(String[] args) {

        // Membuat object dari class Kendaraan
        Kendaraan kd = new Kendaraan();

        // Mengisi data menggunakan setter
        kd.setNoPolisi("N 1234 AA");
        kd.setMerk("Toyota Avanza");
        kd.setTahun(2022);

        // Menampilkan data menggunakan getter
        System.out.println("===== DATA KENDARAAN =====");
        System.out.println("No. Polisi : " + kd.getNoPolisi());
        System.out.println("Merk       : " + kd.getMerk());
        System.out.println("Tahun      : " + kd.getTahun());
    }
}

