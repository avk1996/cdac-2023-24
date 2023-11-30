package pojos;

public class Candidate {
	private String name;
	private String partyName;
	private int voteCount;

	public Candidate(String name, String partyName) {
		super();
		System.out.println("2 para constructor");
		this.name = name;
		this.partyName = partyName;
	}

	public Candidate() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", partyName=" + partyName + ", voteCount=" + voteCount + "]";
	}

}
