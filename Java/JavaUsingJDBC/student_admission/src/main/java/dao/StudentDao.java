package dao;

import java.sql.SQLException;


public interface StudentDao {
	public String addStudent(String firstName, String lastName, int score, String course) throws SQLException;
}