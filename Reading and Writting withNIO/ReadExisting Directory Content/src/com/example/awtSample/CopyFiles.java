package com.example.awtSample;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFiles extends SimpleFileVisitor<Path> {

    private Path sourceRoot;
    private Path targetRoot;

    public CopyFiles(Path sourceRoot, Path targetRoot) {
        this.sourceRoot = sourceRoot;
        this.targetRoot = targetRoot;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path relativisitedPath = sourceRoot.relativize(path);
        System.out.println("RelativizedPath = " + relativisitedPath);
        Path copyDir = targetRoot.resolve(relativisitedPath);
        System.out.println("Resolved path for copy = " + copyDir);

        try {
            Files.copy(path, copyDir);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return FileVisitResult.SKIP_SUBTREE;
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
        System.out.println("Error accessing file: " + path.toAbsolutePath() + " " + e.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        Path relativisitedPath = sourceRoot.relativize(path);
        System.out.println("RelativizedPath = " + relativisitedPath);
        Path copyDir = targetRoot.resolve(relativisitedPath);
        System.out.println("Resolved path for copy = " + copyDir);

        try {
            Files.copy(path, copyDir);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return FileVisitResult.SKIP_SUBTREE;
        }

        return FileVisitResult.CONTINUE;
    }
}
