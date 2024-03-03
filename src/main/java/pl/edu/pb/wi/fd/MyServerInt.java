package pl.edu.pb.wi.fd;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyServerInt extends Remote {
    String getDescription(String text) throws RemoteException;

    Double add(Double firstValue, Double secondValue) throws RemoteException;
}
