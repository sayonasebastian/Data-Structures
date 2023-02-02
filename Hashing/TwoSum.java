import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int d = target - nums[i];
            if (m.containsKey(d)) { 
                return new int[] { i, m.get(d) };
            }
            m.put(nums[i], i);
        }

        return new int[] { -1, -1};
    }
}