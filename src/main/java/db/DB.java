package db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DB {
	public Connection connect() {
		Connection conn = null;
		try {
//			new com.mysql.jdbc.Driver();
			Class.forName("com.mysql.jdbc.Driver").newInstance();
// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase?user=testuser&password=testpassword");
			String connectionUrl = "jdbc:mysql://localhost:3306/test";
			String connectionUser = "root";
			String connectionPassword = "";
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
			 if (conn == null) {
		            System.out.println("Connection cannot be established");
		        }
		        return conn;
		    } catch (Exception e) {
		        System.out.println(e);
		    }
		    return null;
		}
	}