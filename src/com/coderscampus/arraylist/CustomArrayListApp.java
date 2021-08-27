package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListApp {

    public static void main(String[] args) {

        CustomArrayList newCustomArrayList = new CustomArrayList();

        long start = System.currentTimeMillis();
        System.out.println("Please wait currently adding elemnts into the list!");
        // Test for 300 million integer insertion
        for (int i = 0; i < 300_000_000; i++) {
            newCustomArrayList.add(i);
        }
        System.out.println("Done");
        long finish = System.currentTimeMillis();

        System.out.println( finish - start + " ms");
        System.out.println(newCustomArrayList.getSize());
    }

}
