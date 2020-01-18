package main.java.com.damo.generics;

public class GenericMethod {
    private static<T> boolean isEqual(GenericClass<T> g1, GenericClass<T> g2) {
        return g1.getItem().equals(g2.getItem());

    }

    private static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>();
        g1.setItem("hhh");

        GenericClass<String> g2 = new GenericClass<>();
        g2.setItem("hhh");

        GenericClass<Double> d1 = new GenericClass<>();
        d1.setItem(2.0);

        GenericClass<Double> d2 = new GenericClass<>();
        d2.setItem(2.0);

        System.out.println(g1 == g2);
        System.out.println(d1 == d2);

        boolean isEqual = GenericMethod.isEqual(g1, g2);
        System.out.println(isEqual);

        boolean isEqual2 = GenericMethod.isEqual(d1, d2);
        System.out.println(isEqual2);

        int result = GenericMethod.compare(19,12);
        System.out.println(result);

        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));
        System.out.println(System.identityHashCode(g1));
        System.out.println(System.identityHashCode(g2));
    }
}
