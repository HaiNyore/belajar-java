package com.Rasyid.Modul2.Materi;

public class Program1_proses {
    public static int maxSubSum(int [] a){
        int maxSum = 0;     // untuk menampung nilai maksimal
        for (int i = 0; i < a.length; i++) {
            System.out.println("Outer loop");
            for (int j = i; j < a.length; j++) {
                System.out.println("Inner loop 1");
                // variabel untuk menampung nilai sementara
                int thisSum = 0;    // menampung nilai hasil penjumlahan
                for (int k = i; k <= j; k++) {
                    System.out.println("INner loop 2");
                    thisSum += a[k];    // sama dengan(dibaca) -> thisSum = thisSum + a[k]
                    System.out.println("Setelah ditambahkan\t: " +thisSum);
                }
                // masuk if jika nilai thisSum > maxSum
                if (thisSum > maxSum){
                    maxSum = thisSum;
                    System.out.println("Max Sum\t: " +maxSum);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int a [] = {4, -3, 5, -2, -1, 2, 6, -2};
        // semua dijumlah dulu, baru hasil penjumlahan tertinggi itulah nilai yang di return, misal :
        // 4 + (-3) = 1, 1 + 5 = 6, 6 + (-2) = 4, 4 + (-1) = 3, 3 + 2 = 5, 5 + 6 = 11, 11 + (-2) = 9
        // Karena yang tertinggi adalah 11, maka nilai return maxSum adalah 11.
        int maxSum;
        maxSum = maxSubSum(a);
        System.out.println("Max sum adalah\t: " +maxSum);
    }
}
