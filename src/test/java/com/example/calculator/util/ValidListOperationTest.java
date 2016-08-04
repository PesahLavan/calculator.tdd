package com.example.calculator.util;

import com.example.calculator.operation.BaseOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;


public class ValidListOperationTest {

    private ValidListOperation listOperation;
    private List<BaseOperation> mockList;

    @Before
    public void setUp() {
        listOperation = new ValidListOperation();
        mockList = mock(ArrayList.class);

    }

    @Test
    public void validate(List<BaseOperation> list) {
        Assert.assertEquals(listOperation.validate(list), true);
    }
}
