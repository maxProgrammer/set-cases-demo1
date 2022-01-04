package com.maxprogrammer.application;


import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("---------------------");

        set.remove("Tablet");
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("---------------------");

        set.removeIf(x -> x.length() > 3);
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("---------------------");

        set.removeIf(x -> x.charAt(0) == 'T');
        for (String p : set) {
            System.out.println(p);
        }
    }
}
