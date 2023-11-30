package dao;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Candidates;

public class OnlineVotingDAOImple implements OnlineVotingDAO {

	private Connection connection;
	private PreparedStatement pst1, pst2, pst3, pst4;

	public OnlineVotingDAOImple() throws SQLException {
		// TODO Auto-generated constructor stub
		connection = openConnection();
		pst1 = connection.prepareStatement("SELECT first_name,status FROM users WHERE email=? AND password=?");
		pst2 = connection.prepareStatement("UPDATE users SET status=1 WHERE id=?");
		pst3 = connection.prepareStatement("UPDATE candidates SET votes=votes+1 WHERE party=? ");
		pst4 = connection.prepareStatement("SELECT name,party,votes FROM candidates");
	}

	@Override
	public boolean authenticateVoter(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		pst1.setString(1, email);
		pst1.setString(2, password);
	
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next()) {
				// System.out.println(rst.getString(1)+" "+rst.getBoolean(2));
				return true;
			}
		}
		System.out.println("Authencation failed :(");
		return false;
	}

	@Override
	public void updateVoterStatus(int id) throws SQLException {

		pst2.setInt(1, id);
		int result = pst2.executeUpdate();
		if (result == 1)
			System.out.println("Status updated successfully!");
		else
			System.out.println("Updation failed!!!!!!!!!");
	}

	@Override
	public List<Candidates> displayAllCandidates() throws SQLException {
		// TODO Auto-generated method stub
		List<Candidates> cList = new ArrayList<Candidates>();
		try(ResultSet rst = pst4.executeQuery()){
			while(rst.next()) {
				cList.add(new Candidates(rst.getString(1), rst.getString(2), rst.getInt(3)));
			}
		}
		return cList;
	}

	@Override
	public void increamentCandidateVotes(String party, String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		if (authenticateVoter(email, password)) {
			pst3.setString(1, party);
			int result = pst3.executeUpdate();
			if(result == 1) {
				System.out.println("Thank for voting...");
				return;
			}
			else {
				System.out.println("Can't vote... ");
				return;
			}
		}
		System.out.println("Authentication failed :(");
	}

}