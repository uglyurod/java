package com.metanit;

public class task9 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        System.out.println(sumOfCubes(arr));
    }

    private static int sumOfCubes(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            ans += pow(arr[i]);
        }
        return ans;
    }
    private static int pow(int a){
        return a * a * a;
    }
}
