package spring.mvc.whame.login;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {
	
	private String userid;
	private String pw;
	
	public MemberVO() {	}

	public MemberVO(String userid, String pw) {
		super();
		this.userid = userid;
		this.pw = pw;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}