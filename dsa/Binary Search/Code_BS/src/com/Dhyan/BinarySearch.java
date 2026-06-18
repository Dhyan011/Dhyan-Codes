package com.Dhyan;

public class BinarySearch {

    public static void main ( String[] args ){
    int [] arr = {-8 , -7 , 0 , 1 , 3 ,4 , 5 ,6 , 7 , 33 , 34 , 55 , 67 , 68 , 70 , 88 , 90 , 99 , 100 };
    int target = 34 ;
    int ans = BinarySearch(arr,target);
    System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int BinarySearch (int[] arr , int target ){
        int start = 0 ;
        int end = arr.length -1 ;

        while(start <= end ) {
            // find the middle element
           // int mid = ( start + end ) / 2 ;
            //  might be possible that (start + end) exceed the integer limit
            int mid = start + (end - start )/ 2 ;


// target element is less than mid element
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
