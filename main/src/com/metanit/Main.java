package com.metanit;

public class Main{
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        int c = remainder(a, b);
        System.out.println(c);
    }

    private static int remainder(int a, int b) {
        return (a % b);
    }
}
