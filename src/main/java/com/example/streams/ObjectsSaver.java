package com.example.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectsSaver {

    public static void writeObject(Object object, File file) throws IOException {

        try (
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))
        ) {
            objectOutputStream.writeObject(object);
        }
    }

    public static Object readObject(File file) throws IOException, ClassNotFoundException {

        try (
            ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream(file))
        ) {
            return objectOutputStream.readObject();
        }
    }
}
