/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan46.tandanyakamu;

/**
 *
 * @author ASUS
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur() {
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        
        if((0<umur) && (umur<=5)) return (red +"LAGI LUCU-LUCUNYA");
        else if((5<umur) && (umur<=10)) return (red + "MASIH ANAK-ANAK");
        else if((10<umur) && (umur<=13)) return (red + "MASIH REMADJA");
        else if((13<umur) && (umur<=19)) return (red + "ALAY");
        else if((19<umur) && (umur<=29)) return (red + "LAGI GALAU NYARI JODOH");
        else if((29<umur) && (umur<=35)) return (red + "LAGI SIBUK NYARI UANG");
        else if((35<umur) && (umur<=150)) return (red + "SUDAH TUA");
        else return "TIDAK TERDETEKSI KEHIDUPAN";
    }
}
