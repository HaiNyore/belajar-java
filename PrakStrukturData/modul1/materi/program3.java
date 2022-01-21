package com.Rasyid.Modul1.Materi;

// cetak program angka berurut
public class Program3 {
    public static void main(String[] args){
        // deklarasi variabel
        // outer loop
        int a, b;
        for (a = 7; a >= 0; a--){
            // inner loop
            for (b = 7; b >= a; b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
