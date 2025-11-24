
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rendra kurniawan
 */
public class Kalkulator {
    public static void main (String [] args){
       Scanner input = new Scanner (System.in);
       
       System.out.println("====Kalkulator====");
       System.out.println("pilih operasi");
       System.out.println("1.perjumblahan");
       System.out.println("2.pengurangan");
      System.out.println("3.perkalian");
      System.out.println("4.pembagian");
      System.out.println("\nMasukkan pilihan (1-4): ");
      int pilihan = input.nextInt();
      
      System.out.println("Masukkan angka pertama :");
      double angka1 = input.nextDouble();
      System.out.println("Masukkan angka ke dua :");
      double angka2 = input.nextDouble();
      
      double hasil =0;
      boolean valid = true;
      
      switch (pilihan){
          case 1:
                 hasil = angka1+angka2;
               System.out.println("\nHasil pemjumblahan:" +hasil);
               break;
               
          case 2:
              hasil = angka1-angka2;
               System.out.println("\nHasil pengurangan:" +hasil);
               break;
               
          case 3:
              hasil = angka1 * angka2;
              System.out.println("\nHasil perkalian:" + hasil);
              break;
              
          case 4:
              if (angka2 !=0){
                  hasil = angka1 / angka2;
                  System.out.println("\nHasil pembagian:" +hasil);
              }else{
                  System.out.println("\nError: pembagian tidak boleh 0! ");
              }
              break;
          default:
              valid =false;
              System.out.println("\npilihan tidak valid!");
      }
       input.close();
    }
}
