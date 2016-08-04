package com.example.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class AddOperationTest {
    private final int value = 2;
    @Test
    public void apply() {
        AddOperation addOperation = new AddOperation(value);
        Assert.assertEquals(addOperation.apply(2), 4);
    }

}