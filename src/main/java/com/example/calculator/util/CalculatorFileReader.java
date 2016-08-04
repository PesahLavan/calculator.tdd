package com.example.calculator.util;

import com.example.calculator.operation.BaseOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatorFileReader {

    private List<BaseOperation> listInstruction = new ArrayList<>();
    private ValidationLine validationLine = new ValidationLine();
    private ArithmeticalOperationFactory factory = new ArithmeticalOperationFactory();

    public List<BaseOperation> readeLine(Scanner connect) {
        while (connect.hasNext()){
            String line = connect.nextLine();
            try {
                String[] lineValid = validationLine.parse(line);
                listInstruction.add(factory.constructOperation(lineValid));
            } catch (NoValidLineException e) {
                System.out.println("Bad format line");
            }
        }
        connect.close();
        return  listInstruction;
    }
}
