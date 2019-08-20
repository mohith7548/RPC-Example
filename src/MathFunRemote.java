import java.rmi.*;
import java.rmi.server.*;

public class MathFunRemote extends UnicastRemoteObject implements MathFun {
    MathFunRemote() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
        return x - y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x * y;
    }

    @Override
    public double div(int x, int y) throws RemoteException {
        return x / y;
    }

    @Override
    public int mod(int x, int y) throws RemoteException {
        return x % y;
    }
}