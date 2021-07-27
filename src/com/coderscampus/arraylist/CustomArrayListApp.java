package com.coderscampus.arraylist;


import java.util.ArrayList;
import java.util.List;

public class CustomArrayListApp {

    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("leo");
        testList.add(null);
        testList.add("looo");

//        System.out.println(testList.get(1));
        CustomArrayList newCustomArrayList = new CustomArrayList();
        TestClass testClass1 = new TestClass("Leo1");
        TestClass testClass2 = new TestClass("Leo2");
        TestClass testClass3 = new TestClass("Leo3");
        TestClass testClass4 = new TestClass("Leo4");
        TestClass testClass5 = new TestClass("Leo5");
        TestClass testClass6 = new TestClass("Leo6");
        TestClass testClass7 = new TestClass("Leo7");
        TestClass testClass8 = new TestClass("Leo8");
        TestClass testClass9 = new TestClass("Leo9");
        TestClass testClass10 = new TestClass("Leo10");
        TestClass testClass11 = new TestClass("Leo11");
        TestClass testClass12 = new TestClass("Leo12");

        newCustomArrayList.add(testClass1);
        newCustomArrayList.add(testClass2);
        newCustomArrayList.add(testClass3);
        newCustomArrayList.add(testClass4);
        newCustomArrayList.add(testClass5);
        newCustomArrayList.add(testClass6);
        newCustomArrayList.add(null);
        newCustomArrayList.add(testClass8);
        newCustomArrayList.add(testClass9);
        newCustomArrayList.add(testClass10);
        newCustomArrayList.add(testClass11);
        newCustomArrayList.add(testClass12);

        System.out.println(newCustomArrayList);
        System.out.println("The array size is: " + newCustomArrayList.getSize());
//        System.out.println("The 6th element is: " + newCustomArrayList.get(5).toString());
//        System.out.println("The 9th element is: " + newCustomArrayList.get(8).toString());
//        System.out.println("The 35th element is: " + newCustomArrayList.get(15).toString());
    }


}
