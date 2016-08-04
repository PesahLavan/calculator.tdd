package com.example.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class DeductOperationTest {
    private final int value = 2;
    @Test
    public void apply() {
        DeductOperation deductOperation = new DeductOperation(value);
        Assert.assertEquals(deductOperation.apply(2), 0);
    }

}