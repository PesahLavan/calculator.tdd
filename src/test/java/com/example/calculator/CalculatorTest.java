package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CalculatorTest {
    private final String path = "/test/resources/Example1.txt";
//    Object connect;
    InstructionConnect mockConnector;
    Calculator mCalculator;
    CalculatorReporter mockReporter;
    CalculatorFileReader mockReader;
    ValidationLine mockValidatorLine;
    @Before
    public void setUp() throws Exception {
        mockConnector = mock(InstructionConnect.class);
        mockReporter = mock(CalculatorReporter.class);
        mockReader = mock(CalculatorFileReader.class);
        mockValidatorLine = mock(ValidationLine.class);
        mCalculator = new Calculator(mockReporter, mockReader);
    }



    @Test
    public void shouldPrintSummary() throws Exception {
        InstructionConnect connect = mockConnector.connect(path);
        String calcReade = mockReader.readeLine(connect);
        boolean res = mockValidatorLine.valid(calcReade);
        mCalculator.calculate(path);
        verify(mockReporter).print(42);
    }
}
