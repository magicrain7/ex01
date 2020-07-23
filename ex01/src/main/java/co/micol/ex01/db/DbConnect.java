package co.micol.ex01.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	private static Connection conn;
	
	public static Connection getConnection() {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "micol";
		String password = "1234";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
