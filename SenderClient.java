package lab01;

import java.util.*;
import java.rmi.*;
import java.net.*;

/**
 *
 * @author 19bcn7185
 */
public class SenderClient {
    
    
    
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
	   
		client c=(client)Naming.lookup("rmi://localhost:5567/cal");
		System.out.println("-------------------------------------------- rmi demo --------------------------------------------------------------------------------");
		System.out.println("ADDITION OF 2 + 1242 : "+c.add(2, 1242));
		System.out.println("Subtraction OF 4 - 1242 : "+c.sub(4, 1242));
		System.out.println("divide OF 6 / 1242 : "+c.div(6, 1242));
		System.out.println("Multiply OF 5 * 1242 : "+c.multiplication(5, 1242));
       
                

	}
    
}