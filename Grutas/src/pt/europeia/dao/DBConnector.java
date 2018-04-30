package pt.europeia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";    
	private static String driverName = "com.mysql.jdbc.Driver";   
	private static String username = "root";   
	private static String password = "1234";
	private static Connection con;

	public static Connection getConnection() {
		try {
			if (con == null || con.isClosed() ) {
				Class.forName(driverName);
				con = DriverManager.getConnection(url, username, password);
			}
		} catch (ClassNotFoundException ex) {
			
			ex.printStackTrace();
			con = null;
		} catch (SQLException ex) {
			
			ex.printStackTrace();
			con = null;
		}
		return con;
	}
	
	
	
}
