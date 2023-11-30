package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;

	// 1. open connection
	public static Connection openConnection() throws SQLException {
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/AdvJava?useSSL=false&allowPublicKeyRetrieval=true", "sun", "Sun@123Sun");
		return connection;
	}

	// 2. close connection
	public static void closeConnection() throws SQLException{
		if (connection != null)
			connection.close();
	}
	
	//3. return connectioin
	public static Connection getConnection() {
		return connection;
	}

}
