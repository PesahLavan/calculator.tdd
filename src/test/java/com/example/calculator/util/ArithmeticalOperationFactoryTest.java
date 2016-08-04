package com.example.calculator.util;


import com.example.calculator.operation.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticalOperationFactoryTest {
    private ArithmeticalOperationFactory factory;
    private final String[] add = {"add", "2"};
    private final String[] apply = {"apply", "2"};
    private final String[] multiply = {"multiply", "2"};
    private final String[] divided = {"divided", "2"};
    private final String[] deduct = {"deduct", "2"};

    @Before
    public void setUp() {
        factory = new ArithmeticalOperationFactory();
    }

    @Test
    public void constructOperationAdd() {
        Assert.assertTrue(factory.constructOperation(add) instanceof AddOperation);
    }
    @Test
    public void constructOperationApply() {
        Assert.assertTrue(factory.constructOperation(apply) instanceof InitialOperation);
    }
    @Test
    public void constructOperationMultiply() {
        Assert.assertTrue(factory.constructOperation(multiply) instanceof MultiplyOperation);
    }
    @Test
    public void constructOperationDivided() {
        Assert.assertTrue(factory.constructOperation(divided) instanceof DividedOperation);
    }
    @Test
    public void constructOperationDeduct() {
        Assert.assertTrue(factory.constructOperation(deduct) instanceof DeductOperation);
    }
}