package main.java.com.damo.collections;

import java.util.HashMap;

public class WordCounter {
    //单词计数器
    public static void main(String[] args) {
        Integer [] nums = {10, 8, 25, 32, 68, 68, 10, 68, 68, 2, 2, 32, 60};
        HashMap<?, Integer> counts1 = wordCounter(nums);
        System.out.println(counts1);

        String str = "Hi Hello Hello Hi hi";
        String [] words = str.split(" ");
        HashMap<?, Integer> counts2 = wordCounter(words);
        System.out.println(counts2);
    }

    private static <T>HashMap<T, Integer> wordCounter(T groups[]) {
        HashMap<T, Integer> map = new HashMap<>();
        for (T key: groups) {
            Integer keyValue = map.get(key);
            int value = 1;
            if ( keyValue != null ) {
                value = (int) keyValue + 1;
            }
            map.put(key, value);
        }
        return map;
    }
}
