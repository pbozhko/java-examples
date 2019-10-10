package com.example.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadService {

    public static void download(URL url, File file) throws IOException {

        try (
            InputStream streamIn = new BufferedInputStream(url.openStream());
            OutputStream streamOut = new BufferedOutputStream(new FileOutputStream(file))
        ) {
            int a;
            while ((a = streamIn.read()) != -1) {
                streamOut.write(a);
            }
        }
    }
}
