
package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



 /*
 * @author Sachi
 */

public class DBconnection {
    
     static Connection c;
    
    private static void setConnection() throws Exception{
        //Driver import 
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport_game","root","");
    }
    
    public static ResultSet search(String sql) throws Exception {
        
        if(c==null){
            setConnection();
        }
        return c.createStatement().executeQuery(sql);
    }
    
    
    public static void crud(String sql)throws Exception{
        
        if(c==null){
            setConnection();
        }
        c.createStatement().execute(sql);
    }
    
    
    public static Connection getConnection(){
        try{
        if(c == null){
            setConnection();
        }    
        }catch(Exception ex){}
        
        
        return c;
    }
    
 
}
