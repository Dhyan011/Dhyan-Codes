import java.util.HashMap;
import java.util.Map;

class Solution {
public int numberOfBoomerangs(int[][] points) {
int result = 0;

    for (int[] i : points) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] j : points) {
            int dx = i[0] - j[0];
            int dy = i[1] - j[1];
            int distance = dx * dx + dy * dy;
            map.put(distance, map.getOrDefault(distance, 0) + 1);
        }
        for (int count : map.values()) {
            result += count * (count - 1);
        }
    }
    return result;
}

}