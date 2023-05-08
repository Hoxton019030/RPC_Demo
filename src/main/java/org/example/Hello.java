package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Hoxton
 * @since 1.2.0
 **/
public interface Hello extends Remote {
    public String sayHello(String name) throws RemoteException;
}
