package com.example.calculator.util;

import com.example.calculator.operation.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CalculatorFileReaderTest {


    private CalculatorFileReader fileReader;
    private InstructionConnect connect;
    private List<BaseOperation> list = new ArrayList<>();
    private String name = "src/test/resources/Example1.txt";
    private List<BaseOperation> testList = new ArrayList<>();
    @Before
    public void setUp() {

        fileReader = new CalculatorFileReader();
        connect = new InstructionConnect();
        testList.add(new AddOperation(2));
        testList.add(new MultiplyOperation(3));
        testList.add(new InitialOperation(3));
    }

    @Test
    public void readeLine() throws IOException {
        list = fileReader.readeLine(connect.connect(name));
        Assert.assertEquals(list, testList);
    }

}