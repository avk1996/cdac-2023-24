package dao;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojos.Candidate;

public class CandidateDaoImple implements CandidateDao {
	private Connection connection;
	private PreparedStatement pst;
	private Statement pst1;
	
	
	public CandidateDaoImple() throws SQLException{
		super();
		connection =  openConnection();
//		| id | name    | party    | votes |

		pst = connection.prepareStatement("SELECT name,party,votes FROM candidates WHERE name = ? OR party = ?;");
		System.out.println("User DAO create...");
	}

	public void getAllCandidate() throws SQLException{
		System.out.println("1 .In getSpecifiedCAndididate method...");
		pst1 = connection.createStatement();
		ResultSet rst = pst1.executeQuery("SELECT * FROM candidates;");
	}
	
	public List<Candidate> getSpecificCanditate(String name,String pname) throws SQLException{
		System.out.println("1 .In getSpecifiedCAndididate method...");
		
		pst.setString(1, name);
		pst.setString(2, pname);
		List<Candidate> cList = new ArrayList<Candidate>();
		try(ResultSet rst = pst.executeQuery()){
			System.out.println("2. In getSpecifiedCAndididate method...");
			while(rst.next()) {
				System.out.println("3. In getSpecifiedCAndididate method...");
				System.out.println("**"+rst.getString(1)+" "+rst.getString(2));
				cList.add(new Candidate(rst.getString(1),rst.getString(2)));
			}
		}
		System.out.println("4. In getSpecifiedCAndididate method...");
		return cList;
	}
	
	public void cleanUp() throws SQLException{
		if(pst!=null)
			pst.close();
		connection.close();
		System.out.println("All resesurces closed...");
		
	}

}