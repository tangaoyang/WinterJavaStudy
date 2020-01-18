package main.java.com.damo.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();

        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"E");

        List<String> list = new ArrayList<>();
        list.add("O");
        list.add("U");

        vowels.addAll(list);

        list.add("X");
        System.out.println(vowels);

        vowels.set(2, "E");

        vowels.clear();
        vowels.add("E");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        list = vowels.subList(0, 2);
        System.out.println("vowels = " + vowels);
        System.out.println("list = " + list);
        vowels.set(0, "A");
        System.out.println("list = " + list);
        for (String str: list) {
            System.out.println(System.identityHashCode(str));
        }
        for (String str: vowels) {
            System.out.println(System.identityHashCode(str));
        }
    }
}
