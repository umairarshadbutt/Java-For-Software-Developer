package com.example.awtSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {
            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1Copy.txt");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//        Path path = FileSystems.getDefault().getPath("OutThere.txt");
//        printFile(path);
//        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//        printFile(filePath);
//        filePath = Paths.get("/home/azaidi/Desktop/FileSystemText3.txt");
//        printFile(filePath);
//
//        Path path2 = FileSystems.getDefault().getPath("thisFileDoesNotExist.txt");
//        System.out.println(path2.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(path2));
//    }
//
//    private static void printFile(Path path) {
//        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
