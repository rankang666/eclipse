package pojo;

public class UserInfo {
	private int sid;
	private String name;
	private String password;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [sid=" + sid + ", name=" + name + ", password=" + password + "]";
	}
	
}
