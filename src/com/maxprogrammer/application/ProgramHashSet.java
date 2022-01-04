package com.maxprogrammer.application;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}
