/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan45.cetaknama;

import DataClass.Printer;
import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Cetak Nama
 */
public class PBOIF210119051Latihan45CetakNama {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Printer printer = new Printer();
        
            System.out.println("=====Aplikasi Pencetak Nama=====");
            System.out.print("Masukkan nama anda : ");
            printer.setNama(scanner.nextLine());
            System.out.print("Mau cetak nama berapa kali? : ");
            printer.setJmlCetak(scanner.nextInt());
        
            printer.cetak(printer.getNama());
            printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
    

