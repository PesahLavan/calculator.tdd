package com.example.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyOperationTest {
    private final int value = 2;
    @Test
    public void apply() {
        MultiplyOperation multiplyOperation = new MultiplyOperation(value);
        Assert.assertEquals(multiplyOperation.apply(2), 4);
    }

}