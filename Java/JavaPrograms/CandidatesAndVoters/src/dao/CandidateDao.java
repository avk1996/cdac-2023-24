package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Candidate;

public interface CandidateDao {
	
	List<Candidate> getSpecificCanditate(String name,String pname) throws SQLException;
	void getAllCandidate() throws SQLException;
}
