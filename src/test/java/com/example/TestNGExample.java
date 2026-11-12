package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test
    public void testAddition() {

        int a = 10;
        int b = 20;

        int result = a + b;

        Assert.assertEquals(result, 30);

        System.out.println("TestNG Test Passed!");
    }
}