package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Hoxton
 * @since 1.2.0
 **/
public class HelloImpl extends UnicastRemoteObject implements  Hello{
    public HelloImpl() throws RemoteException {
        super();
    }
    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }
}
