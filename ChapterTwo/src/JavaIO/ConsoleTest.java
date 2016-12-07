package JavaIO;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console con = System.console();
        if (con==null) {
            System.out.println("NullPointer in console");
            return;
        }
        char[] pass = con.readPassword();
        for (int i = 0; i < pass.length; i++) {
            System.out.println(pass[i]);
        }
    }
}
