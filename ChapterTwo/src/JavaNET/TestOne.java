package JavaNET;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestOne {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip4 = InetAddress.getLocalHost();
        System.out.println(ip4);
        ip4 = InetAddress.getLoopbackAddress();
        System.out.println(ip4);
        ip4 = InetAddress.getByName("bash.im");
        System.out.println(ip4);
        ip4 = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(ip4);
    }
}
