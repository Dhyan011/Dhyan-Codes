class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0 ;
        int end = nums.length - 1 ;


        while ( start <end ){
            int mid = start + (end - start ) / 2 ;
            if (nums[mid] > nums[mid+1]) {

                //you are in decreasing part of array
                //this may be the ans , but look at left
                // this is why end != mid -1

                end = mid;

            }
            else {
                // you are in asc part of array
                start = mid + 1 ; // because we know that mid+1 element > mid element
            }
        }
        //in the end the start == end and pointing to largest number because of 2 checks
        // start and end are always trying to find max elements in above 2 checks
        // hence , when they are pointing to just one element , that is the max one
        return start ; // or return end as both are equal
    }
}