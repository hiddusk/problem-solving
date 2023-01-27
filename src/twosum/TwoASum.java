package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoASum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Map map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++) {
            if(map.containsKey(target-nums[i])) {
                System.out.println(new int[]{(Integer) map.get(target-nums[i]),i});
                System.exit(0);
            } else {
                map.put(nums[i], i);
            }
        }
    }
} // O(n) time complexity
