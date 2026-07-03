package com.Dhyan;
//amazon interview question
//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main ( String[] args ){

        int [] arr =  {3 , 4 , 5 ,67, 889 , 2345 , 3445 , 6667 , 90877 };
        int target = 2345;
        System.out.println(and(arr, target));

    }

    static int and(int[]arr , int target) {

        // first find the range
        //first start with box of 2

        int start = 0;
        int end = 1;

        //condition for the target to lie in the range

        while (target > arr[end]) {
            int newStart = end + 1;

            // double the box value if target not found
            // end = previous end + sizeofbox
            end = end + (end - start + 1)* 2 ;
            start = newStart;
         }

        return  BinarySearch( arr , target , start , end );
    }

    static int BinarySearch (int[] arr , int target , int start , int end ){





        while(start <= end ) {
            // find the middle element
            // int mid = ( start + end ) / 2 ;
            //  might be possible that (start + end) exceed the integer limit
            int mid = start + (end - start )/ 2 ;



            if ( target < arr[mid]) {
                end = mid -1 ;
            } else if ( target > arr[mid]){
                start = mid + 1 ;
            }else {
                // and found
                return mid ;
            }
        }

        return -1 ;
    }
}
