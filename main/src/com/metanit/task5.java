package com.metanit;

public class task5{
    public static void main(String[] args){
        int N = 3;
        int a = 9;
        int b = 3;
        System.out.println(operation(N, a, b));
    }

    private static String operation(int N, int a, int b) {
        if (a + b == N)
            return "added";
        else
            if (a - b == N)
                return "subtracted";
            else
                if (a * b == N)
                    return "multiplied";
                else
                    if (a / b == N)
                        return "divided";
                    else
                        return "none";
    }
}
