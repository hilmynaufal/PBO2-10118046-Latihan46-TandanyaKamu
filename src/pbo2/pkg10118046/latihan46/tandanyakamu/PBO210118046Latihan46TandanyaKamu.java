/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan46.tandanyakamu;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung umur berapa lama kamu hidup
 */
public class PBO210118046Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Age age = new Age(Year.now().getValue());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda: "); 
        age.setYearBirth(scanner.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda: " + age.getYearBirth());
        System.out.println("Hari ini tahun: " + age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu "  + age.tandanyaKamu(age.hitungUmur()));
    }

}
