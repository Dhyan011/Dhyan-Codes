package com.dhyan;
// this example is same as we done before just we have to set the start and end limit like from what range we have to check
// just a little change in the code we written in @linear search code
public class SearchInRange {
    public static void main( String [] args ){
        int[]arr = { 12 , 34 , 56 , 78 , 37 , 27 , 9 } ;
        int target =27 ;
        int start = 3 ;
        int end = 5 ;
        System.out.println(search(arr , target , start , end )) ;
    }

    static int  search(int[] arr , int target , int start , int end ){
        if ( arr.length ==  0 ){
            return -1 ;
        }

        //run a for loop
        for ( int i = start ; i <= end ; i++ ){
            // check for the elemnt at very index
            int element = arr[i];
            if ( element == target ){
                return i ;
            }
        }
        return -1 ;
    }
}
