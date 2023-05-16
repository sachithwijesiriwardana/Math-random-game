/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author Sachi
 * parent class of the server
 * Abstraction
 */
public interface RMIInterface extends Remote {
    
    //Abstract methods this is used to exchange data between server and client
    public String Register(String username,String email,String password,String confirm_password)throws RemoteException;
    public String Login (String umail, String upass)throws RemoteException;
    public String ScoreUpdate(String email,  int score)throws RemoteException;
   

    //public boolean Login(JTextField umail, JPasswordField upass);
    
    
    
}
