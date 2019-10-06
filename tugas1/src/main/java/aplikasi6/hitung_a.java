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
public class hitung_a {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int harga = 660000;
    int jumlah ;
    int total ;
    
    System.out.print ("Harga 1 Printer = 660.000\n");
    
    System.out.print ("Masukkan Jumlah Barang = ");
    jumlah = input.nextInt();
    total = harga*jumlah;
   
    System.out.print("Total Bayar = " + total);
    
}
}
