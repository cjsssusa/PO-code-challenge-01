package com.example;

import java.util.*;
import java.util.regex.Pattern;

public class P3 {

    void mergeArrays(int[] a, int[] b, int n, int m) {

        Map<Integer, Boolean> mp = new TreeMap<Integer, Boolean>();

        for (int i = 0; i < n; i++) {
            mp.put(a[i], true);
        }
        for (int i = 0; i < m; i++) {
            mp.put(b[i], true);
        }

        Integer[] key = mp.keySet().toArray(new Integer[0]);
//        System.out.println(Arrays.toString(key));

        double median;
        if (key.length % 2 == 0)
            median = ((double) key[key.length / 2] + (double) key[key.length / 2 - 1]) / 2;
        else
            median = (double) key[key.length / 2];

//        System.out.println(key.length);
//        System.out.println(key.length / 2);
        System.out.println(median);
    }

    public void pb3() {
//        int[] a = {1, 3, 5, 7}, b = {2, 4, 6, 8};
//        int[] a = {1, 3}, b = {2};
//        int[] a = {1, 2}, b = {3,4};
        int[] a = {1, 2, 9}, b = {3, 4, 9, 34, 35};

        int size = a.length;
        int size1 = b.length;

        mergeArrays(a, b, size, size1);
    }
}
