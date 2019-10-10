package com.example.streams;

import com.example.model.Color;
import com.example.model.Lamp;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String... args) throws ClassNotFoundException {

        String srcFolderPath = "/home/bozhko/images";
        String dstFolderPath = "/home/bozhko/images/out";

        String fileNameFrom = "book.pdf";
        String fileNameTo = "data.bin";
        String imageFileName = "image.png";

        File dstFolder = new File(dstFolderPath);

        if (!dstFolder.exists()) {
            dstFolder.mkdirs();
        }

        File fileFrom = new File(srcFolderPath + "/" + fileNameFrom);
        File fileTo = new File(dstFolder + "/" + fileNameTo);
        File imageFile = new File(dstFolder + "/" + imageFileName);

        try {

//            DownloadService.download(new URL("https://upload.wikimedia.org/wikipedia/commons/4/47/PNG_transparency_demonstration_1.png"), imageFile);
//            BufferedCopyFiles.copy(fileFrom, fileTo);
//            CopyFiles.copy(fileFrom, fileTo);
//            CopyFiles.copy(fileFrom, fileTo);

            Lamp lamp1 = new Lamp("Name", "Description", Color.WHITE, 60.0);
            ObjectsSaver.writeObject(lamp1, fileTo);

            Lamp lamp2 = (Lamp) ObjectsSaver.readObject(fileTo);
            System.out.println(lamp2);

            String[] pathsFilesAndDir = dstFolder.list();

            for (String path : pathsFilesAndDir) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
