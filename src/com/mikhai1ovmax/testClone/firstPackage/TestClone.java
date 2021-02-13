package com.mikhai1ovmax.testClone.firstPackage;

public class TestClone implements Cloneable{
    String text;

    TestClone() {}

    public TestClone(String text)
    {
        this.text = text;
    }

    @Override
    public TestClone clone() throws CloneNotSupportedException {
        return new TestClone(text);
    }
}