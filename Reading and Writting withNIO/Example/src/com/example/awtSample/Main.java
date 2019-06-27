package com.example.awtSample;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Path dataPath = FileSystems.getDefault().getPath("data.txt");
            List<String> lines = Files.readAllLines(dataPath);
            for(String line: lines){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
