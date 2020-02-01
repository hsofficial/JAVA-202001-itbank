package ch13.customException;

public class IDFormatTest {
	public String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) 
			throw new IDFormatException("null ID error");
		else if(userID.length() < 8 || userID.length() > 20)
			throw new IDFormatException("ID must be over 8 / under 20 chars ");
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "123456";
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
