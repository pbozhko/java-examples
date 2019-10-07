package com.example.streams;

import com.example.model.Color;
import com.example.model.Lamp;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String... args) {

        String srcFolderPath = "/home/bozhko/images";
        String dstFolderPath = "/home/bozhko/images/out";

        String fileNameFrom = "example.txt";
        String fileNameTo = "test.bin";

        File dstFolder = new File(dstFolderPath);

        if (!dstFolder.exists()) {
            dstFolder.mkdirs();
        }

        File fileFrom = new File(srcFolderPath + "/" + fileNameFrom);
        File fileTo = new File(dstFolder + "/" + fileNameTo);

        try {

            BufferedCopyFiles.copy(fileFrom, fileTo);
//            CopyFiles.copy(fileFrom, fileTo);
//            CopyFiles.copy(fileFrom, fileTo);

//            Lamp lamp1 = new Lamp("Name", "Description", Color.WHITE, 60.0);
//            ObjectsSaver.writeObject(lamp1, fileTo);
//            Lamp lamp2 = (Lamp) ObjectsSaver.readObject(fileTo);
//            System.out.println(lamp2);

            String[] pathsFilesAndDir = dstFolder.list();

            for (String path : pathsFilesAndDir) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
