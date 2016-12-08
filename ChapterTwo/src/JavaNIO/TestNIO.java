package JavaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestNIO {
    public static void main(String[] args) {

        try(FileChannel channel = FileChannel.open(Paths.get("ChapterTwo/TestNIO.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {


            String str = "This is test JavaNIO.2";
            ByteBuffer buf = ByteBuffer.allocate(str.length());
            byte[] bytes = str.getBytes();
            for (int i = 0; i < str.length(); i++)
                buf.put(bytes[i]);
            buf.flip();
            channel.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
