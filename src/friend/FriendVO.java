package friend;

public class FriendVO {
	private String name;
	private String tel;
	private String city;
	private String birth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "FriendVO [name=" + name + ", tel=" + tel + ", city=" + city + ", birth=" + birth + "]";
	}

}
