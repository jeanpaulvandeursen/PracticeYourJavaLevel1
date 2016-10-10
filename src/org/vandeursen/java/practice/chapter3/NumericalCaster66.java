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
        int x = 10;
        long y = 30;
        long result = x + y; //implicit cast allowed because result type will not have data loss
        // int result = x + y; implicit cast not allowed, compiler insists on explicit cast
        short v = 1;
        short w = 2;
        // short res = v + w; Not allowed, computations are done using int, this implicit cast is
        // not performed by the compiler.
    }
}
