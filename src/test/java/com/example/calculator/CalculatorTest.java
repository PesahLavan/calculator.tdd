package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CalculatorTest {
    private final String path = "/test/resources/Example1.txt";
    InstructionConnect mockConnector;
    Calculator mCalculator;
    CalculatorReporter mockReporter;
    CalculatorFileReader mockReader;
    @Before
    public void setUp() throws Exception {
        mockConnector = mock(InstructionConnect.class);
        mockReporter = mock(CalculatorReporter.class);
        mockReader = mock(CalculatorFileReader.class);
        mCalculator = new Calculator(mockReporter, mockReader);
    }



    @Test
    public void shouldPrintSummary() throws Exception {

        mCalculator.calculate(path);
        verify(mockReporter).print(42);
    }
}
