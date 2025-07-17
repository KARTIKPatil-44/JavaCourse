package Operators;

public class UranayOperators {
    public static void main(String[] args) {
        // pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // // pre decrement
        int c = 10;
        int d = --c;
        System.out.println(c);
        System.out.println(d);
        // 1. value change
        // 2. value uses

        // post increment
        int e = 10;
        int f = e++;
        System.out.println(e);
        System.out.println(f);

        // post decrement
        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
        // 1. value uses
        // 2. value changes
    }
    
}
