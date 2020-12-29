package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = in.nextInt();
        }
        int max1 = -1;
        int max2 = -1;
        for(int i : a) {
            if (i >= max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2)
                max2 = i;
        }
        System.out.println("Second maximum is " + max2);
    }
}
