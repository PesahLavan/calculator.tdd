package com.example.calculator.util;


import com.example.calculator.operation.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticalOperaitonFactoryTest {
    private ArithmeticalOperationFactory factory;
    private final int value = 2;
    private final String add = "add";
    private final String apply = "apply";
    private final String multiply = "multiply";
    private final String divided = "divided";
    private final String deduct = "deduct";

    @Before
    public void setUp() {
        factory = new ArithmeticalOperationFactory();
    }

    @Test
    public void constructOperationAdd() {
        Assert.assertTrue(factory.constructOperation(add, value) instanceof AddOperation);
    }
    @Test
    public void constructOperationApply() {
        Assert.assertTrue(factory.constructOperation(apply, value) instanceof InitialOperation);
    }
    @Test
    public void constructOperationMultiply() {
        Assert.assertTrue(factory.constructOperation(multiply, value) instanceof MultiplyOperation);
    }
    @Test
    public void constructOperationDivided() {
        Assert.assertTrue(factory.constructOperation(divided, value) instanceof DividedOperation);
    }
    @Test
    public void constructOperationDeduct() {
        Assert.assertTrue(factory.constructOperation(deduct, value) instanceof DeductOperation);
    }
}