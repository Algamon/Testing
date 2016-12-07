package JavaIO;

import java.io.*;
import java.util.Random;

public class InputOutputFileTest {
    public static void main(String[] args) {
        System.out.println("Test FileInput/OutputStream");
        try (FileOutputStream outs = new FileOutputStream("ChapterTwo/TextChapterTwo.txt");
             FileInputStream input = new FileInputStream("ChapterTwo/TextChapterTwo.txt")) {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                byte x = (byte) rand.nextInt();
                System.out.println("Writing: " + x);
                outs.write(x);
            }
            System.out.println("Writing success. Start Reading...");
            for (; ; ) {
                int x = input.read();
                if (x == -1) break;
                else System.out.println("Reading: " + (byte) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream outs = new FileOutputStream("ChapterTwo/TextChapterTwoString.txt")) {
        String str = "Test String. It's byte format.";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            outs.write(aByte);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
