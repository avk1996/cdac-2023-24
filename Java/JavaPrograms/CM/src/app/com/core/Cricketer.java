package app.com.core;

public class Cricketer {
	private static int cricketerNumber;
	private int id;
//	private String cricketerName;
	private CricketerNames cricketerName;
	private int cricketerAge;
	private String cricketerEmail;
	private String cricketerPhoneNo;
	private int cricketerRating;
	static {
		cricketerNumber=0;
	}
	
	public static int getCricketerNumber() {
		return cricketerNumber;
	}


	public static void setCricketerNumber(int cricketerNumber) {
		Cricketer.cricketerNumber = cricketerNumber;
	}

	public Cricketer(CricketerNames cricketerName, int cricketerAge, String cricketerEmail, String cricketerPhoneNo,
			int cricketerRating) {
		super();
		id=++cricketerNumber;
		this.cricketerName = cricketerName;
		this.cricketerAge = cricketerAge;
		this.cricketerEmail = cricketerEmail;
		this.cricketerPhoneNo = cricketerPhoneNo;
		this.cricketerRating = cricketerRating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Cricketer(String cricketerName) {
		super();
		this.cricketerName = CricketerNames.valueOf(cricketerName.toUpperCase());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cricketer) {
			Cricketer anotherCricketer = (Cricketer)obj;
			return this.cricketerName.equals(anotherCricketer.cricketerName);
		}
		return false;
	}

	public CricketerNames getCricketerName() {
		return CricketerNames.valueOf(cricketerName.name());
	}
	public void setCricketerName(String cricketerName) {
		this.cricketerName = CricketerNames.valueOf(cricketerName.toUpperCase());
	}
	public int getCricketerAge() {
		return cricketerAge;
	}
	public void setCricketerAge(int cricketerAge) {
		this.cricketerAge = cricketerAge;
	}
	public String getCricketerEmail() {
		return cricketerEmail;
	}
	public void setCricketerEmail(String cricketerEmail) {
		this.cricketerEmail = cricketerEmail;
	}
	public String getCricketerPhoneNo() {
		return cricketerPhoneNo;
	}
	public void setCricketerPhoneNo(String cricketerPhoneNo) {
		this.cricketerPhoneNo = cricketerPhoneNo;
	}
	public int getCricketerRating() {
		return cricketerRating;
	}
	public void setCricketerRating(int cricketerRating) {
		this.cricketerRating = cricketerRating;
	}
	
	@Override
	public String toString() {
		return "Cricketer [id=" + id + ", cricketerName=" + cricketerName + ", cricketerAge=" + cricketerAge
				+ ", cricketerEmail=" + cricketerEmail + ", cricketerPhoneNo=" + cricketerPhoneNo + ", cricketerRating="
				+ cricketerRating + "]";
	}
}
