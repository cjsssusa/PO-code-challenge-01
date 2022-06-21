package com.example;

import java.util.ArrayList;
import java.util.List;

public class P5 {

    void sherlockAndSquares(int a, int b) {

        int min = (int) Math.ceil(Math.sqrt(a));

//        System.out.println(min);

        int i = min;
        for (; i * i <= b; i++) {
        }
        System.out.println(i - min);
    }

    public void pb5() {

        sherlockAndSquares(3, 9);
        sherlockAndSquares(17, 24);
        sherlockAndSquares(1, 1000000000);
        sherlockAndSquares(9, 9);
        sherlockAndSquares(8, 8);
    }
}
