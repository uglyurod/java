package com.metanit;

public class task4{
    public static void main(String[] args){
        double prob = 0.9;
        int prize = 3;
        int pay = 2;
        System.out.println(profitableGamble(prob, prize, pay));
    }

    private static boolean profitableGamble(double a, int b, int c) {
        /*if ((a * b) > c)
            return true;
        else
            return false;*/
        return (a * b) > c;
    }
}
