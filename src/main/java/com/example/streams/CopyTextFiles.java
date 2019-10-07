package com.example.streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFiles {

    public static void copy(File fileFrom, File fileTo) throws IOException {

        try (
            FileReader fileReader = new FileReader(fileFrom);
            FileWriter fileWriter = new FileWriter(fileTo)
        ) {
            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
            }
        }
    }
}
