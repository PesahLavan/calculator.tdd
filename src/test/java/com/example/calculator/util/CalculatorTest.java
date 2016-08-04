package com.example.calculator.util;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CalculatorTest {

    private Calculator mCalculator;
    private String name = "src/test/resources/Example1.txt";


    @Before
    public void setUp() {
        mCalculator = new Calculator();

    }

    @Test
    public void calculatorTest() throws IOException {
        mCalculator.calculate(name);

    }

}