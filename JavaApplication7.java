/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.sql.*;
/**
 *
 * @author user
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application lo
        try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/world","root","varad11041997");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from Gcode ");   
			while(rs.next())  
			System.out.println(rs.getString(1)+"\t"+ rs.getString(2)); 
			con.close();  
			}catch(Exception e){ System.out.println(e);}
    }
    
}
