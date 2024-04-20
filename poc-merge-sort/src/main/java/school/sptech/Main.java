package school.sptech;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = {20, 31, 34, 12, 43, 54, 12, 3, 4, 5};

        System.out.println(Arrays.toString(v));

        System.out.println(Arrays.toString(MergeSort.ordenacaoInteiro(0, v.length, v)));
    }
}