package com.Dhyan;

public class OrderAgnosticBS {

    public static void main(String[] args) {
        int [] arr = {-8 , -7 , 0 , 1 , 3 ,4 , 5 ,6 , 7 , 33 , 34 , 55 , 67 , 68 , 70 , 88 , 90 , 99 , 100 };
        int target = 7 ;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int  orderAgnosticBS (int[] arr , int target ){
        int start = 0 ;
        int end = arr.length - 1 ;

        // find weather array is sorted in asc or desc

        boolean isAsc = arr[start] < arr[end];

        while(start <= end ) {
            int mid = start + (end - start )/ 2 ;


            if ( arr[mid] == target ) {
                return mid ;
            }

            if (isAsc){
                if ( target < arr[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1 ;
                }
            }else {
                if ( target > arr[mid]){
                    end = mid - 1 ;
                } else
                    start = mid + 1 ;
            }

        }

        return -1 ;
    }
}
