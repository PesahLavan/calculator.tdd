package com.example.calculator.util;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InstructionConnect {
    private Path path;
    private Scanner readSca;

    public Scanner connect(String name) throws IOException {
        path = Paths.get(name);
        readSca = new Scanner(path);
        return readSca;
    }
}
