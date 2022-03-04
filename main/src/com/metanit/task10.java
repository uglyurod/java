package com.metanit;

public class task10 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(abcmath(a, b ,c));
    }

    private static boolean abcmath(int a, int b, int c) {
        while (b != 0){
            a *= 2;
            b--;
        }
        return(a % c == 0);
    }
}