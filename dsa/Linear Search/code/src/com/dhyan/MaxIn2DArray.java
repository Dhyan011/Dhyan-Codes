package com.dhyan;

import java.util.Arrays;

public class MaxIn2DArray {
    public static void main ( String [] args ){

        int [][] arr = {
                {23 , 4 , 5 },
                {6 , 33 , 78, 45},
                {8 , 9 , 1  },
                {4,6}
        };


        int ans = max(arr) ;//format of return value ( row , col )
        System.out.println(max(arr));
    }

    static int max(int [][] arr  ){
        int max = Integer.MIN_VALUE;
        for(int row = 0 ; row <arr.length ; row ++){
            for( int col =  0 ; col < arr[row].length; col++ ){
                if(arr[row][col] > max ) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
