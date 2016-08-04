package com.example.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class InitialOperationTest {
    private final int value = 2;
    @Test
    public void apply() {
        InitialOperation initialOperation = new InitialOperation(value);
        Assert.assertEquals(initialOperation.apply(2), value);
    }

}