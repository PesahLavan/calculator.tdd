package com.example.calculator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InstructionConnect {
    public Scanner connect(String name) throws IOException {
        Path path = Paths.get(name);
        Scanner readSca = new Scanner(path);
        return readSca;
    }
}
