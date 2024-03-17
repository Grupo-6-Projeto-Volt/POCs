package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void ordernarVetorInteiro(int v[]){
        int i,j,x,n = 0;
        for (i = 1; i < v.length; i++) {
            x = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > x){
                v[j+1] = v[j];
                j = j - 1;
                n++;
            }
            v[j+1] = x;
        }
        System.out.println(Arrays.toString(v));
    }
    public static void ordernarVetorDouble(double v[]){
        int i,j,n = 0;
        for (i = 1; i < v.length; i++) {
            Double x = v[i];
            j = i - 1;
            while (j >= 0 && v[j] > x){
                v[j+1] = v[j];
                j = j - 1;
                n++;
            }
            v[j+1] = x;
        }
        System.out.println(Arrays.toString(v));
    }
}
