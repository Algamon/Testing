package JavaNET;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WhoIsTest {
    public static void main(String[] args){
        try(Socket inet = new Socket("whois.nic.im",43);
            InputStream in = inet.getInputStream();
            PrintWriter out = new PrintWriter(new OutputStreamWriter(inet.getOutputStream()));
            Scanner sc = new Scanner(System.in)){
            int c;
            System.out.print("¬ведите название сайта: ");
            String str = sc.nextLine();
            out.print(str);
            out.print("\r\n");
            out.flush();
            while((c=in.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (Exception exp){
                exp.printStackTrace();
        }


    }
}
