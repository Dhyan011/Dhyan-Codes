package com.dhyan;

import java.util.Arrays;
import java.util.Scanner;

public class Swap2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        // taking input
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        // swapping first and last element
        Swap2(arr, 0, N - 1);

        in.close();
    }

    static void Swap2(int[] arr, int index0, int indexNMinus1) {

        int temp = arr[index0];

        arr[index0] = arr[indexNMinus1];

        arr[indexNMinus1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}