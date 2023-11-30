package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import static utils.DBUtils.*;

public class StudentDaoImple implements StudentDao {
	private Connection connection;
	private PreparedStatement pst1;

	public StudentDaoImple() throws SQLException {
		// TODO Auto-generated constructor stub
		connection = getConnection();
		pst1 = connection.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");	
	}

	@Override
	public String addStudent(String firstName, String lastName, int score, String course) throws SQLException {
		// TODO Auto-generated method stub
		pst1.setString(1, firstName);
		pst1.setString(2, lastName);
		pst1.setInt(3, score);
		pst1.setString(4, course);
		int querySuccess = pst1.executeUpdate();
		if(querySuccess == 1)
			return "Student Added Successfully"; 
		return "Student Add Failed";
	}
	
	public void closeUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
	}

}
