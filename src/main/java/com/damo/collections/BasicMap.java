package main.java.com.damo.collections;

import java.util.*;

public class BasicMap {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("A", "A");
        data.put("B", "B");
        data.put(null, "C");
        data.put("D", null);
        data.put("D", "D");

        System.out.println(data);
        String value = data.get(null);
        System.out.println("Key = null, Value = " + value);

        value = data.getOrDefault("M", "Default");
        System.out.println("Key = M, Value = " + value);

        boolean keyExist = data.containsKey(null);
        boolean valueExist = data.containsValue(null);
        System.out.println("keyExist = " + keyExist + "\nvalueExist = " + valueExist);

        System.out.println("data map size is " + data.size());

        Set<Map.Entry<String, String>> entrySet = data.entrySet();
        System.out.println(entrySet);

        Set<String> keySet = data.keySet();
        System.out.println("data keys = " + keySet);

        Collection<String> values = data.values();
        System.out.println("data values = " + values);

        data.clear();
        System.out.println("data map is empty = " + data.isEmpty());
    }
}
