/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_20_Targetsaldotabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = input.nextDouble();
        System.out.print("Masukkan bunga per bulan (%): ");
        double bunga = input.nextDouble();
        System.out.print("Masukkan saldo target: ");
        double saldoTarget = input.nextDouble();

        // Inisialisasi bulan
        int bulan = 1;

        // Perulangan hingga saldo mencapai target
        while (saldoAwal < saldoTarget) {
            // Hitung bunga
            double bungaTambahan = saldoAwal * (bunga / 100);

            // Hitung saldo akhir
            saldoAwal += bungaTambahan;

            // Tampilkan hasil
            System.out.println("Saldo di bulan ke-" + bulan + ": Rp " + saldoAwal);

            // Increment bulan
            bulan++;
        }
    }
}
