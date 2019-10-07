package com.example.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

    public static void copy(File fileFrom, File fileTo) throws IOException {

        try (
            InputStream streamIn = new FileInputStream(fileFrom);
            OutputStream streamOut = new FileOutputStream(fileTo)
        ) {

            int a;
            while ((a = streamIn.read()) != -1) {
                streamOut.write(a);
            }
        }
    }
}
