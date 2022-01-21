package com.Rasyid.Modul2.Tugas;

import java.util.Random;

public class Program1_modify {
    public static int maxSubSum(int [] a){
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random random = new Random();

        int a [] = new int [1000];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(5);
        }
        int maxSum;
        maxSum = maxSubSum(a);

        long finish = System.currentTimeMillis();
        long selisih = (finish - start);
        System.out.println("Max sum adalah\t: " +maxSum);
        System.out.println("Program dijalankan dengan waktu " +selisih+ " Milisekon");
    }
}
