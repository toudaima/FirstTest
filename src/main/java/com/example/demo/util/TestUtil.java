package com.example.demo.util;

public class TestUtil {

    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
        int i;
        try {
            i = 1;
            return i;
        } catch (Exception e) {

        } finally {
            i = 3;
            return i;
        }

    }
}
