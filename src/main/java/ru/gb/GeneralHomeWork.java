package ru.gb;

import java.util.Arrays;

public class GeneralHomeWork {

    public static void main(String[] args) {
        oneToZero();
        oneToHundred();
        timesTwo();
        diagonAlley();
        twoArguements(10, 25);


    }

    public static void oneToZero() {

        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr[i] = 1;

            } else {

                arr[i] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void oneToHundred() {

        int[] arr01 = new int[101];

        for (int i = 0; i < arr01.length; i++) {

            arr01[i] = i;
        }
        System.out.println(Arrays.toString(arr01));
    }


    public static void timesTwo() {

        int[] arr02 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr02.length; i++) {

            if (arr02[i] < 6) {

                arr02[i] = arr02[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr02));
    }

    public static void diagonAlley() {

        int[][] arr03 = new int[6][6];

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (i == j) {

                    arr03[i][j] = 1;

                }
                System.out.printf("%2d", arr03[i][j]);
            }
            System.out.println();
        }

    }

    public static int[] twoArguements(int len, int initialValue) {

        int[] arr04 = new int[len];

        for (int i = 0; i < arr04.length; i++) {

            arr04[i] = initialValue;

        }

        System.out.println(Arrays.toString(arr04));
        return arr04;
    }

}

