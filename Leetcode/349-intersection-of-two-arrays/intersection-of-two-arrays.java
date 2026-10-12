import java.util.*;

class Solution {
public int[] intersection(int[] nums1, int[] nums2) {
Set set = new HashSet<>();
Set result = new HashSet<>();

    for (int num : nums1) {
        set.add(num);
    }
    for (int num : nums2) {
        if (set.contains(num)) {
            result.add(num);
        }
    }
    int[] ans = new int[result.size()];
    int i = 0;
    for (Object num : result) {
        ans[i++] = (Integer) num;
    }
    return ans;
}

}