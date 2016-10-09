package org.vandeursen.java.practice.chapter1;

/**
 * Created by jp on 08/10/2016.
 */
public class Man19 {

    public static void main(String[] args) {
        Man18 man02 = new Man18();
        man02.firstName = "jp";
        man02.lastName = "vd";
        System.out.println(man02.firstName + man02.lastName);
        System.out.println(man02.gender);
        man02.gender = "female";
        System.out.println(man02.gender);
    }

}
