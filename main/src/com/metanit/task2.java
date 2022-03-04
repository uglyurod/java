package com.metanit;

public class task2{
    public static void main(String[] args){
        int a = 3;
        int b = 2;
        int c = triArea(a, b);
        System.out.println(c);
    }

    private static int triArea(int a, int b) {
        return ((a * b) / 2);
    }

}
