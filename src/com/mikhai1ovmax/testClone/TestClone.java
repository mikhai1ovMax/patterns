package com.mikhai1ovmax.testClone;

class TestClone implements Cloneable{
    String text;

    TestClone() {}

    TestClone(String text)
    {
        this.text = text;
    }

    @Override
    protected TestClone clone() throws CloneNotSupportedException {
        return new TestClone(text);
    }
}