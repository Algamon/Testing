package JavaNIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestWriteNIO {
    public static void main(String[] args) {
        try(FileChannel chan = (FileChannel) Files.newByteChannel(Paths.get("ChapterTwo/TestNIO.txt"), StandardOpenOption.WRITE,
            StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            String str = "YOUR FACE JARAXXUS! EREDAR LORD OF THE BURNING LEGION!";
            byte[] bs = str.getBytes();
            MappedByteBuffer buf = chan.map(FileChannel.MapMode.READ_WRITE,0,bs.length);
            for (int i = 0; i < bs.length; i++) {
                buf.put(bs[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
