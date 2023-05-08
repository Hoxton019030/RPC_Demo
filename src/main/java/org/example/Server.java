package org.example;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Hoxton
 * @since 1.2.0
 **/
public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        HelloImpl obj = new HelloImpl();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("Hello", obj);
        System.out.println("Server ready");
    }
}