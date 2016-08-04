package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CalculatorTest {
    private final String path = "/test/resources/Example1.txt";


    private InstructionConnect mockConnector;
    private Calculator mCalculator;
    private CalculatorReporter mockReporter;
    private CalculatorFileReader mockReader;
    private ValidationLine mockValidatorLine;
    private ArithmeticalOperationFactory mockFactory;

    @Before
    public void setUp() throws Exception {
        mockConnector = mock(InstructionConnect.class);
        mockReporter = mock(CalculatorReporter.class);
        mockReader = mock(CalculatorFileReader.class);
        mockValidatorLine = mock(ValidationLine.class);
        mockFactory = mock(ArithmeticalOperationFactory.class);
        mCalculator = new Calculator(mockReporter, mockReader);
    }



    @Test
    public void shouldPrintSummary() throws Exception {
        Scanner connect = mockConnector.connect(path);
        List<Object> calcReade = mockReader.readeLine(connect);
        String[] res = mockValidatorLine.parse(connect.nextLine());
        Object operation = mockFactory.constructOperation(res);

        mCalculator.calculate(path);
        verify(mockReporter).print(42);
    }
}
