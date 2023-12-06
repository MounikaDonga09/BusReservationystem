package bdb;

import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/busres";
	private static final String userName = "root";
	private static final String passWord = "root";
	
	public static Connection getConnection() {
		try {
			return  DriverManager.getConnection(url,userName,passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}