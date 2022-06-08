package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

    public void pb1() {

        Scanner sc = new Scanner(System.in);
        int n = new Integer(sc.nextLine());

        ArrayList<String[]> arrList = new ArrayList<String[]>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arrList.add(s.split(" "));
        }


        for (String[] sa : arrList) {
            int max = 0;
            int sec = 0;
            for (int j = 0; j < 3; j++) {
                int t = new Integer(sa[j]);
                if (max < t) {
                    sec = max;
                    max = t;
                } else if (sec < t) {
                    sec = t;
                }
            }
            System.out.println(sec);
        }
    }
}
