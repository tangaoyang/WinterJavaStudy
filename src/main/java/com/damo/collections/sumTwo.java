package main.java.com.damo.collections;

import java.util.HashMap;

public class sumTwo {
    public static int [] sumTwo(int []nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            final Integer value = map.get(nums[i]);
            if ( value != null ) {
                return new int[] {value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int [] result = sumTwo(nums, 9);
        System.out.println(result[0] + " " + result[1]);
    }
}
