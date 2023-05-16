/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import Server.RMIInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
/**
 *
 * @author Sachi
 */
public class SportClient {
    
    //Encapsulation
    
    private final Registry reg;
     private final RMIInterface server;
   
    //connection of RMI en
    
    public SportClient() throws RemoteException ,NotBoundException{
    
    reg = LocateRegistry.getRegistry("Localhost",1099);
    server = (RMIInterface)reg.lookup("rmi://localhost/MyService");
    
    }
    public RMIInterface getServer(){
    
    
    return server;
    }
    
    
}
