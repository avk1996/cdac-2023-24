package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;
//	private PreparedStatement pst;

	//connection established
	public static Connection openConnection() throws SQLException {
		System.out.println("connection establisted...");
		String dbUrl = "jdbc:mysql://localhost:3306/AdvJava?useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(dbUrl, "sun", "Sun@123Sun");
		return cn;
	}
	//connection closed
	public static void closeConnection() throws SQLException{
		if(cn!=null)
			cn.close();
		System.out.println("connection closed...");
	}
}
