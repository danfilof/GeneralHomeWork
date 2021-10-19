package ru.gb;

import java.util.Arrays;

public class GeneralHomeWork  {

    public static void main(String[] args)  {
    oneToZero();
    }

    public static void oneToZero() {

        int[] arr = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr[i] = 1;

            } else {

                arr[i] = 0;
            }

        }
        System.out.println (Arrays.toString(arr));
    }

}

