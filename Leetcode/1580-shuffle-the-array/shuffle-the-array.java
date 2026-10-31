class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[]Result = new int[nums.length];

        for (int i=0; i < n ; i++){
            Result [2*i] = nums[i];
            Result [2*i + 1] = nums[i+n];
        }


        System.gc();
        return Result ; 
        
    }
}