package com.company;

public class Test {

    private int a;

    public Test(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    private void testMethod1() {
        System.out.println("testMethod1: " + a * 10);
    }
    private void testMethod2() {
        System.out.println("testMethod2: " + a * 20);
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                '}';
    }
}
