package org.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Hoxton
 * @since 1.2.0
 **/
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost");
        Hello stub = (Hello) registry.lookup("Hello");
        String response = stub.sayHello("World");
        System.out.println("response = " + response);
    }
}
