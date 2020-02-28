package bookEx;

public class BookVO {
	private String code;
	public String subject;
	
	public BookVO() {
	}
	public BookVO(String code, String subject) {
		this.code = code;
		this.subject = subject;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
