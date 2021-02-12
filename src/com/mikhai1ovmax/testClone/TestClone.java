package com.mikhai1ovmax.testClone;

class TestClone implements Cloneable {
    String text;

    TestClone() {}

    TestClone(String text)
    {
        this.text = text;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone t1 = new TestClone("Abc");
        TestClone t2 = (TestClone) t1.clone();
        System.out.println(t1 + " " + t1.text);
        System.out.println(t2 + " " + t2.text);
    }
}