
package lab01;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 19bcn7186
 */
public interface client extends Remote{  
   
        public int add(int n1,int n2) throws RemoteException;
        public int sub(int n1,int n2) throws RemoteException;
        public double div(double n1,double n2) throws RemoteException;
        public int multiplication(int n1,int n2) throws RemoteException;
        
        
	
}