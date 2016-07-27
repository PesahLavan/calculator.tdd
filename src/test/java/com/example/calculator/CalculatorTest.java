package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CalculatorTest {
    Calculator mCalculator;
    CalculatorReporter mockReporter;
    CalculatorFileReader mockReader;
    @Before
    public void setUp() throws Exception {
        mockReporter = mock(CalculatorReporter.class);
        mockReader = mock(CalculatorFileReader.class);
        mCalculator = new Calculator(mockReporter, mockReader);

    }

    @Test
    public void shouldPrintSummary() throws Exception {
        String path = "/test/resources/Example1.txt";
        mCalculator.calculate(path);
        verify(mockReporter).print(42);

    }
}
