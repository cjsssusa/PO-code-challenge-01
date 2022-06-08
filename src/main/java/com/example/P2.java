package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class P2 {

    private final Pattern pattern = Pattern.compile("\\d");

    public void pb2() {

        Scanner sc = new Scanner(System.in);
        int n = new Integer(sc.nextLine());

        ArrayList<String> arrList = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arrList.add(s);
        }


        for (String sa : arrList) {
            int tot = 0;
            for (int j = 0; j < sa.length(); j++) {
                String t = String.valueOf(sa.charAt(j));
                if (pattern.matcher(t).matches()) {
                    tot += new Integer(t);
                }
            }

            System.out.println(tot);
        }
    }
}
