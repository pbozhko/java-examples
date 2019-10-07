package com.example.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedCopyFiles {

    public static void copy(File fileFrom, File fileTo) throws IOException {

        try (
            InputStream streamIn = new BufferedInputStream(new FileInputStream(fileFrom));
            OutputStream streamOut = new BufferedOutputStream(new FileOutputStream(fileTo))
        ) {

            int a;
            while ((a = streamIn.read()) != -1) {
                streamOut.write(a);
            }
        }
    }
}
