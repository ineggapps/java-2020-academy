package member;

public class MemberVO {
	private String name;
	private String pwd;
	private String tel;
	private String birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", pwd=" + pwd + ", tel=" + tel + ", birth=" + birth + "]";
	}
	
	public String toStringExceptPwd() {
		return "MemberVO [name=" + name + ", tel=" + tel + ", birth=" + birth + "]";

	}

	
	public MemberVO() {
	}

	public MemberVO(String name, String pwd, String tel, String birth) {
		this.name = name;
		this.pwd = pwd;
		this.tel = tel;
		this.birth = birth;
	}

	
}
