package pl.edu.pb.wi.fd;

import java.rmi.Naming;
import java.util.List;

public class MyClientMain {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        System.setSecurityManager(new SecurityManager());
        try {
            MyServerInt myRemoteObject = (MyServerInt) Naming.lookup("//localhost/ABC");

            List<String> result = myRemoteObject.findAll();

//            System.out.println("Wysłano do servera: ");
            System.out.println("Otrzymana z serwera odpowiedź FindAll: " + result);

            List<String> result2 = myRemoteObject.findAllByName("A");
            System.out.println("Otrzymana z serwera odpowiedź FindByName(\"A\"): " + result2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}