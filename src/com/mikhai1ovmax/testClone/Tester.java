package com.mikhai1ovmax.testClone;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone testClone = new TestClone("1");
        TestClone testClone1 = testClone.clone();
        System.out.println(testClone);
        System.out.println(testClone1);
    }
}
