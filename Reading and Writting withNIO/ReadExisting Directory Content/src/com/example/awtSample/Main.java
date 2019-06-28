package com.example.awtSample;


import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);

        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");  // FileTree\\Dir2 (windows)
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myApp", ".appext");
            System.out.println("Temporary file path = "+ tempFile);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores= FileSystems.getDefault().getFileStores();
        for (FileStore store : stores){
            System.out.println("Volume name/Drive letter "+stores);
            System.out.println("File store "+store.name());
        }

        System.out.println("**********************");
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path path: rootPaths){
            System.out.println(path);
        }
    }
}
