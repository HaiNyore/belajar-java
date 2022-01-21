package com.Rasyid.Modul1.Tugas;

public class SegiAngka {
    public static void main(String[] args){
        int k = 1;
        // outer loop
        for (int i = 0; i < 4; i++) {
            // inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print(k % 10 + " ");
                k++;
            }
            System.out.println();
        }
    }
}
