package com.example.calculator.util;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class CalculatorTest {


    private Calculator mCalculator;
    private CalculatorReporter mockReporter;
    private InstructionConnect mockConnect;
    private CalculatorFileReader mockReader;
    private ValidationLine mockValidationLine;



    @Before
    public void setUp() {
        mCalculator = mock(Calculator.class);
        mockReporter = mock(CalculatorReporter.class);
        mockConnect = mock(InstructionConnect.class);
        mockReader = mock(CalculatorFileReader.class);
        mockValidationLine = mock(ValidationLine.class);
        mCalculator = new Calculator(mockReporter, mockReader);

    }

    @Test
    public void calculatorTest() {


    }

}