package com.Rasyid.Modul3.Materi;
// Code re-written by Rasyid Ramadhani
// User code: 20104099
import java.util.Scanner;

// Tidak menggunakan rekursif
public class fib1_proses {
    public static long fib1(long num) {
        if(num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else {
            long x = 0;
            long y = 1;
            for (int n = 2; n <= num; n++) {
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }
    /*
    Misal input(num) <= 3
        Step 1 (n = 2)
            y = 0 + 1 = 1
            x = 1 - 0 = 1
            y = 1
        Step 2 (n = 3)
            y = 1 + 1 = 2
            x = 2 - 1 = 1
            y = 2
        Fibonacci dengan input num 3 hasilnya adalah 2
     */

    /*
    contoh case (Bilangan Fibonacci)
        x / f(0) = 0
        y / f(1) = 1
        n / f(2) = f(2-1) + f(2-2)
                 = f(1) + f(0)
                 = 1 + 0
                 = 1
        n / f(3) = f(3-1) + f(3-2) + f(3-3)
                 = f(2) + f(1) + f(0)
                 = 1 + 1 + 0
                 = 2
        n / f(n) = f(n-1) + f(n-1) + ... + f(n-n)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan fibonacci ke-n\t: ");
        long bil = scanner.nextLong();
        System.out.println(fib1(bil));
    }
}
