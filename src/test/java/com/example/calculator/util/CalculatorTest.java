package com.example.calculator.util;

import com.example.calculator.operation.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    private Calculator calculator;
    private List<BaseOperation> operations;

    @Before
    public void setUp() {
        calculator = new Calculator();
        operations = new ArrayList<>();
    }

    @Test
    public void calculatorTest() {
        operations.add(new AddOperation(2));
        operations.add(new MultiplyOperation(3));
        operations.add(new DeductOperation(4));
        operations.add(new DividedOperation(5));
        operations.add(new InitialOperation(3));
        Assert.assertEquals(calculator.calc(operations), 2);

    }

}