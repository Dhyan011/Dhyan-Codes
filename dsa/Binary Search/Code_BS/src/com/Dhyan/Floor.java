package com.Dhyan;

public class Floor {
        public static void main ( String[] args ){
            int [] arr = { 2 , 3 , 5 , 9 , 14 , 16 , 18  };
            int target = 15 ;
            int ans = Floor(arr,target);
            System.out.println(ans);
        }

        //return the index of Greatest number <= target

        static int Floor(int[] arr , int target ){
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

            return end ;
        }
    }


