package pl.edu.pb.wi.fd;

import java.math.BigDecimal;
import java.rmi.Naming;

public class MyClientMain {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        System.setSecurityManager(new SecurityManager());
        try {
            MyServerInt myRemoteObject = (MyServerInt) Naming.lookup("//localhost/ABC");

            Double firstValue = 1d;
            Double secondValue = 2d;
            Double result = myRemoteObject.add(firstValue, secondValue);

            System.out.println("Wysłano do servera: " + firstValue + " + " + secondValue);
            System.out.println("Otrzymana z serwera odpowiedź: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}