package JavaNIO;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class TestReadNIO {
    public static void main(String[] args) {
        try(FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("ChapterTwo/TextChapterTwoString.txt"))){
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0,channel.size());
            for (int i = 0; i < channel.size(); i++) {
                System.out.print((char)buffer.get()+" ");
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
