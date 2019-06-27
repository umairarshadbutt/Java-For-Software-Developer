package com.example.awtSample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel= binFile.getChannel()){

            byte[] outputBytes = "Hello World!".getBytes();
            ByteBuffer buffer= ByteBuffer.wrap(outputBytes);
            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: "+ numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: "+numBytes);

            intBuffer.flip();
            intBuffer.putInt(-951245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: "+numBytes);

//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            Files.write(dataPath,"Line 5".getBytes("UTF-8"), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line: lines){
//                System.out.println(line);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
