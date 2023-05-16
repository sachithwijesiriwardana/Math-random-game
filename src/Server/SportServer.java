
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import org.json.JSONObject;
//import java.sql.SQLException;

/**
 *
 * @author Sachi
 */
// Start of the Server side
//server class inherit all the methods of the interface

public class SportServer extends UnicastRemoteObject implements RMIInterface {

    int solution = 0;
    String question = null;

    public SportServer() throws RemoteException {

        super();

    }

    public static void main(String[] args) throws RemoteException {

        try {
            // Start Server

            Registry reg = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            SportServer obj = new SportServer();

            reg.rebind("rmi://localhost/MyService", obj);
            System.out.println("Server is  Running");

        } catch (RemoteException ex) {

            System.out.println(ex.getMessage()); 
        }
        //This is used to run at the same time the server and the api
        //SportServer sp = new SportServer();
       // sp.callAPI();
       // System.out.println("answer=" + sp.returnQuestion());

    }

    public void callAPI() {
        try {
            String url = "https://marcconrad.com/uob/smile/api.php";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            int responseCode = con.getResponseCode();
            //  System.out.println("\nSending 'GET' request to URL : " + url);
            //  System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject myResponse = new JSONObject(response.toString());
            //    System.out.println("result after Reading JSON Response");
            //    System.out.println(myResponse);
            System.out.println("solution :" + myResponse.getInt("solution"));
            solution = myResponse.getInt("solution");

            System.out.println("question :" + myResponse.getString("question"));
            question = myResponse.getString("question");
        } catch (Exception ex) {
            System.out.println("cannot connect to smile API :" + ex);
        }

        
        
    }

    public String returnQuestion() {
        return question;
    }

    public int returnSolution() {
        return solution;
    }

    @Override
    public String Register(String username, String email, String password, String confirm_password) throws RemoteException {
        String response_reg = " ";

        if (password.equals(confirm_password)) {
            try {
                DBconnection.crud("INSERT INTO user(username,email,password) values ('" + username + "','" + email + "','" + password + "')");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            response_reg = "Register Sucessful..";
        } else {
            response_reg = "Check the password..";
        }
        return response_reg;

    }

    @Override
    public String Login(String email, String password) throws RemoteException {

        String response = "";
        try {
            ResultSet rs = DBconnection.search("SELECT * FROM user WHERE email ='" + email + "'");

            if (!rs.next()) {
                response = "Incorrect email...";
            } else {
                if (rs.getString("password").equals(password)) {
                    response = "Login Successfull.";
                } else {
                    response = "Incorrect password..";
                }
            }

            return response;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return response;

        }

    }

    @Override
    public String ScoreUpdate(String email, int score) throws RemoteException {

        String response_reg = "";

        if (email != null) {
            try {
                DBconnection.crud("INSERT INTO `score`(`e-mail`, `score`) VALUES ('" + email + "'," + score + ")");
                response_reg = "add";
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
        } else {
            response_reg = "not add";
        }
        response_reg = "not add";
        return response_reg;

    }

}
