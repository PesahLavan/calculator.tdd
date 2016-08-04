package com.example.calculator.util;
import com.example.calculator.operation.BaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class CalculatorTest {


    private Calculator mCalculator;
    private CalculatorReporter mockReporter;
    private CalculatorFileReader mockReader;
    private List<BaseOperation> operations;

    @Before
    public void setUp() {
        mCalculator = mock(Calculator.class);
        mockReporter = mock(CalculatorReporter.class);
        mockReader = mock(CalculatorFileReader.class);
        mCalculator = new Calculator(mockReporter, mockReader);
    }

    @Test
    public void calculatorTest() {


    }

}