package com.example.awtSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try {


//create a director
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

            //create directories
            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
            Files.createDirectories(dirToCreate);


//create a file
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

//            delete a file
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);


//            Moving a file
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Path destination =FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.move(fileToMove,destination);

//            Copy File and Directory
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1Copy1.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
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
