package com.example.calculator.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidationLineTest {
    private final String line = "multiply 3";
    private final String[] lineRes = {"multiply","3"};
    private ValidationLine validationLine;

    @Before
    public void setUp() {
        validationLine = new ValidationLine();
    }

    @Test
    public void parseTest() {
        try {
            Assert.assertEquals(validationLine.parse(line), lineRes);
        } catch (NoValidLineException e) {
            e.printStackTrace();
        }
    }

}