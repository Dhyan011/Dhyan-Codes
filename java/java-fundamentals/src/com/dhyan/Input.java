package com.dhyan;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main (String[] args){
        int [] arr = new int[5];
        Scanner in = new Scanner(System.in);
        //array of primitives
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 45;
        arr[3] = 54;
        arr[4] = 84;
        System.out.println(arr[3]);


//        // input using for loop
//        for ( int i =0 ; i< arr.length ; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        // same for loop but for printing whole array
//        for ( int i =0 ; i< arr.length ; i++){
//            System.out.println(arr[i] + " ");
//        }
//        for (int num : arr) { // for every element in array , print the element
//            System.out.println(num + " "); // here num represents element of thr array
//        }

        //array of objects
        String[] str = new String[4];
        for (int i = 0 ; i< str.length ; i++) {
            str[i] = in.next();
        }
        //modify
        str[1] = "Dhyan";
        System.out.println(Arrays.toString(str));

        }

    }

