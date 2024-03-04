package pl.edu.pb.wi.fd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MyServerInt extends Remote {
    List<String> findAllByName(String name) throws RemoteException;

    List<String> findAll() throws RemoteException;
}
