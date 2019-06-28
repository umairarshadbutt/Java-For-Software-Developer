package com.example.awtSample;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintNames extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        System.out.println(path.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        System.out.println(path.toAbsolutePath());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
        System.out.println("Error accessing file: " + path.toAbsolutePath() + " " + e.getMessage());
        return FileVisitResult.CONTINUE;
    }
}
