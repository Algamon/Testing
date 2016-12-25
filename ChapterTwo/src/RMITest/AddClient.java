package RMITest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AddClient {
    public static void main(String[] args) {
        String addServerURL = "rmi://127.0.0.1/AddServer";
        try {
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
            System.out.println(addServerIntf.add(15,3.14));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
