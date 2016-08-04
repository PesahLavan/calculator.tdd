package com.example.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class DividedOperationTest {
    private final int value = 2;
    @Test
    public void apply() {
        DividedOperation dividedOperation =new DividedOperation(value);
        Assert.assertEquals(dividedOperation.apply(2), 1);
    }

}