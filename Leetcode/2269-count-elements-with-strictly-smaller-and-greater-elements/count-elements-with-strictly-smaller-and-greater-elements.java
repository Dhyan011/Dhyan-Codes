class Solution {
public int countElements(int[] nums) {
int min = nums[0];
int max = nums[0];
int count = 0;

    for (int num : nums) {
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    for (int num : nums) {
        if (num > min && num < max) {
            count++;
        }
    }
    return count;
}

}