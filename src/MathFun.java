import java.rmi.*;

public interface MathFun extends Remote {
    public int add(int x, int y) throws RemoteException;
    public int sub(int x, int y) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
    public double div(int x, int y) throws RemoteException;
    public int mod(int x, int y) throws RemoteException;
}