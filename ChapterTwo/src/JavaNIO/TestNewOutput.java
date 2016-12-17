package JavaNIO;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestNewOutput {
    public static void main(String[] args) throws InterruptedException, IOException {
        ProcessBuilder run = new ProcessBuilder("notepad",
            "D:\\Program Files\\JavaProjects\\Testing\\ChapterTwo\\TestNIO.txt");
        try {
            run.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(OutputStream ostr = Files.newOutputStream(Paths.get("ChapterTwo/TestNIO.txt"))) {

            String str = "YOUR FACE JARAXXUS!!";
            byte[] bytes = str.getBytes();
            for (int i=0;i<bytes.length;i++)
                ostr.write(bytes[i]);

            String str2 = " EREDAR LORD OF THE BURNING LEGION!";
            byte[] bytes2 = str2.getBytes();
            for (int i=0;i<bytes2.length;i++)
                ostr.write(bytes2[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
