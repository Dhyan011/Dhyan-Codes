package com.dhyan;

public class Main {
    public static void main (String [] args ){

        int [] ary = { 35 , 467 , 34, 47 , 678 , 79 , -26 , -678 , 66 };
        int target = 66 ;
        int ans = linearSearch(ary , target);
        System.out.println(ans);



    }


    //search in the array : return the index if item found
    //otherwise if item no found return -1
    static int linearSearch (int[] arr , int target ) {

        if (arr.length == 0) {
            return -1;
        }
        //run for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1 ;
    }
}
