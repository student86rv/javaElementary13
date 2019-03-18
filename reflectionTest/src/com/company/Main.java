package com.company;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Test test = new Test(10);

        String methodName1 = "testMethod1";
        String methodName2 = "testMethod2";

        try {
            Method method = test.getClass().getDeclaredMethod(methodName1);
            method.setAccessible(true);
            method.invoke(test);
            method.setAccessible(false);

            Method method2 = test.getClass().getDeclaredMethod(methodName2);
            method2.setAccessible(true);
            method2.invoke(test);
            method2.setAccessible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
