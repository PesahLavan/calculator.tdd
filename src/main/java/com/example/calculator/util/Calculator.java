package com.example.calculator.util;

import com.example.calculator.operation.BaseOperation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private CalculatorFileReader fileReader = new CalculatorFileReader();
    private InstructionConnect connect = new InstructionConnect();
    private List<BaseOperation> list = new ArrayList<>();


    public void calculate(String path) throws IOException {
        list = fileReader.readeLine(connect.connect(path));
    }
}
