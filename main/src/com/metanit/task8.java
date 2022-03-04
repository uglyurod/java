package com.metanit;

public class task8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(nextEdge(a, b));
    }

    private static int nextEdge(int a, int b) {
        return (a + b - 1);
    }
}
