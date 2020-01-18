package main.java.com.damo.generics;

class GenericsClass<P> {
    P ob;

    public GenericsClass(P ob) {
        this.ob = ob;
    }


    public P getOb() {
        return ob;
    }

    void getType() {
        System.out.println("Type is " + ob.getClass().getName());
    }
}

public class ScratchGenerics {

    public static void main(String[] args) {
        GenericsClass<Double> dOb = new GenericsClass<>(3.14);
        dOb.getType();
        System.out.println("Value is " + dOb.getOb());

        GenericsClass<String> strOb = new GenericsClass<>("Generics Demo");
        strOb.getType();
        System.out.println("Value is " + strOb.getOb());
    }
}
