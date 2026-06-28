public class Solution {


    public static void main(String[] args) {


    }

    public int[] searchRange (int[] nums , int target ) {

        int[] ans = {-1, -1}
        // check for first occurance if target first
        int start = 0 ;
        int end = nums.length - 1 ;

        // find weather array is sorted in asc or desc

        boolean isAsc = nums[start] < nums[end];

        while(start <= end ) {
            int mid = start + (end - start )/ 2 ;


                if ( target < nums[mid]){
                    end = mid - 1 ;
                } else {
                    start = mid + 1 ;
                }
            }else {
                if ( target > nums[mid]){
                    end = mid - 1 ;
                } else
                    start = mid + 1 ;
            } else {

            //potential ans found

            return mid ;

        }

        return ans ;
    }
