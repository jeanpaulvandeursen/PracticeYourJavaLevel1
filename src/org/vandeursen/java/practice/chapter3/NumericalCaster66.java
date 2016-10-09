package org.vandeursen.java.practice.chapter3;

/**
 * Created by jp on 09/10/2016.
 */
public class NumericalCaster66 {

    public static void main(String[] args) {
        int a = 44444;
        short b = (short)a;
        System.out.print(b);
        // Integer i = 7;
        // String s = (String) i; Cast will fail at compile time, since it is not possible to
        // convert an integer into a string.
    }
}
