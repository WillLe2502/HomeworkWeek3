package Week3_1;

public class User {
	private String userName;
	private String address;

	public User(String userName, String address) {
		super();
		this.userName = userName;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Username: " + userName + "\n" + "Address:" + address;
	}
}
