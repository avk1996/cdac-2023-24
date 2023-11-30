package beans;

import java.sql.SQLException;

import dao.StudentDaoImple;

public class StudentBean {
	private StudentDaoImple stuDao;
	public StudentDaoImple getStuDao() {
		return stuDao;
	}

	public void setStuDao(StudentDaoImple stuDao) {
		this.stuDao = stuDao;
	}

	private String firstName;
	private String lastName;
	private String course;
	private int testScore;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTestScore() {
		return testScore;
	}

	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}



	public StudentBean() {
		// TODO Auto-generated constructor stub
	}
	
	public String addStudent() throws SQLException {
		/*
		 * 1. validate score with respective course selected
		 * 2. create Dao instance 
		 * 
		 * */
		String success;
		if(course == "DAC" && testScore < 80) {
			return "failure1";
		}
		else if(course == "AI" && testScore < 70) {
			return "failure2";
		}
		else if(course == "DBDA" && testScore < 85) {
			return "failure3";
		}
		success = stuDao.addStudent(firstName, lastName, testScore, course);
		return success;
		
	}

}
