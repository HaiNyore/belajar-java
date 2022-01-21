package com.Rasyid.Modul1.Materi;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // deklarasi variabel
        double luas, pi = 3.14;
        int jari;
        System.out.print("inputkan jari-jari\t: ");
        jari = input.nextInt();
        // perhitungan luas
        luas = pi * jari * jari;
        // output
        System.out.println("Luas lingkaran\t: " +luas);
    }
}
