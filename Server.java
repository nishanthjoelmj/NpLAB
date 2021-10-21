package lab01;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 19BCN7186
 */
public class Server  extends UnicastRemoteObject implements client  {
    
    
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Server() throws RemoteException{
		 super();
	 }

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
    
	   Registry reg=LocateRegistry.createRegistry(5567);
		
         reg.bind("cal",new  Server());

	}

    @Override
    public int add(int n1, int n2) throws RemoteException {
         
        return n1+n2;
    }


    @Override
    public int sub(int n1, int n2) throws RemoteException {
       
        return n1-n2;
    }

    @Override
    public double div(double n1, double n2) throws RemoteException {
        return (double)(n1/n2);
    }

    @Override
    public int multiplication(int n1, int n2) throws RemoteException {
       
        return n1*n2;
    }
    
}