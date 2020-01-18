package main.java.com.damo.collections;

public class Baoli {
    public static int [] Baoli(int []nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ( nums[i] + nums[j] == target ) {
                    return new int [] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int [] result = Baoli(nums, 9);
        System.out.println(result[0] + " " + result[1]);

    }
}
