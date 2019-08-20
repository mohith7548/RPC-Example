import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            MathFun stub = new MathFunRemote();
            System.out.println("Starting Server...");
            Naming.rebind("rmi://localhost:5000/kune", stub);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}