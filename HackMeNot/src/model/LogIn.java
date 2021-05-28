package model;

public class LogIn {

	private String username;
	private String password;
	private String target;

	public LogIn(String username, String password, String target) {
		this.username = username;
		this.password = password;
		this.target = target;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

}
