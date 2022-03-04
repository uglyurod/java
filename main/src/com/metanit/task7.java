package com.metanit;

public class task7 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(addUpTo(n));
    }

    private static int addUpTo(int a) {
        int ans = 0;
        for (int i = 1; i <= a; i++){
            ans = ans + i;
        }
        return ans;
    }
}
