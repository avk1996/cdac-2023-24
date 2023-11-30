package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Candidates;

public interface OnlineVotingDAO {
	boolean authenticateVoter(String email,String password) throws SQLException;
	void updateVoterStatus(int id) throws SQLException;
	void increamentCandidateVotes(String party,String email,String password) throws SQLException;
	List<Candidates> displayAllCandidates() throws SQLException;
}
