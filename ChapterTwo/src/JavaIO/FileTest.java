package JavaIO;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File fl = new File("/ChapterTwo/TextChapterTwo.txt");
        System.out.println(fl.getName());
        System.out.println(fl.getPath());
        System.out.println(fl.canRead());
        System.out.println(fl.isAbsolute());
        System.out.println(fl.getFreeSpace());
        File dir = new File("ChapterTwo/src");
        String str[] = dir.list();
        for (String s : str) {
            System.out.println(s);
        }



    }
}
