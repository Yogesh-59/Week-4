package org.javaAnnotations.suppressUncheckedWarnings;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Adding elements of different types
        list.add("Hello");
        list.add(100);
        list.add(45.67);
        list.add(true);

        // Retrieving elements
        String str = (String) list.get(0);
        int num = (int) list.get(1);
        double dbl = (double) list.get(2);
        boolean ans=(boolean) list.getLast();

        // Printing elements
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Double: " + dbl);
        System.out.println("Boolean: "+ans);
    }
}
