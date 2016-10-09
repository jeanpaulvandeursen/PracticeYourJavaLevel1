package org.vandeursen.java.practice.chapter3;

/**
 * Created by jp on 08/10/2016.
 */
public class FloatTester37 {

    public static void main(String[] args) {
        float myFloat = 7.123456423F;
        System.out.println(myFloat);
        float yetAnotherFloat = 1768000111.77F;
        System.out.printf("%f\n",yetAnotherFloat); //output = 1768000128.000000 because of float 6-7 digit precision, compare:
        double myDouble = 1768000111.77;
        System.out.printf("%f\n",myDouble);
        double tenth = 1.0f/10.0f;
        System.out.printf("%.15f\n",tenth);
    }

}
