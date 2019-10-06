/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi6;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class hitung_b {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double disc ;
    double harga = 660000;
    double jumlah, bayar, total;
    
    System.out.print("Harga 1 Buah Printer = 660000 \n");
    
    System.out.print("Masukkan Jumlah Pembelian = ");
    jumlah = input.nextDouble();
    bayar = jumlah*harga;
    //Hitung Diskon 
    if (bayar > 15000000) {
        bayar = jumlah*harga;
        disc = bayar*0.15;
        total = bayar-disc;
        System.out.print("Diskon Yang Diterima = " + disc);
        System.out.print(" \n");
        System.out.print("Total Yang Harus Dibayar = " + total);
    }
    else{
        System.out.print("Total Yang Harus Dibayar = " + bayar);
        
    }
    
    }
    
    
}
