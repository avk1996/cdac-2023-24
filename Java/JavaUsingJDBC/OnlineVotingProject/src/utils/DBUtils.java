package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;
	public static Connection openConnection() throws SQLException{
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvJava?useSSL=false&allowPublicKeyRetrieval=true", "sun","Sun@123Sun");
		return connection;
	}
}
