package jp.co.aforce.beans;

public class Login implements java.io.Serializable {
	
	private String login_id;
	private String password;
	
	public String getLogin_id() {
		return login_id;
	}
	public String getPassword() {
		return password;
	}
	
	public void setLogin_id(String login_id) {
		this.login_id=login_id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}
