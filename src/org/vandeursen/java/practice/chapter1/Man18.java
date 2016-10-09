package org.vandeursen.java.practice.chapter1;

/**
 * Created by jp on 08/10/2016.
 */
public class Man18 {

    public static String gender="male";
    public String firstName;
    public String lastName;

    public static void main(String[] args) {
        Man18 man01 = new Man18();
        man01.firstName = "jp";
        man01.lastName = "vd";
        System.out.println(man01.firstName + man01.lastName);
        System.out.println(man01.gender);
        man01.gender = "female";
        System.out.println(man01.gender);
    }
}
