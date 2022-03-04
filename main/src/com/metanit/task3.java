package com.metanit;

public class task3{
    public static void main(String[] args){
        int chickens = 1;
        int cows = 2;
        int pigs = 3;
        int ans = animals(chickens, cows, pigs);
        System.out.println(ans);
    }

    private static int animals(int a, int b, int c) {
        return a * 2 + (b + c) * 4;
    }
}
