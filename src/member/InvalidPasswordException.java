package member;

public class InvalidPasswordException extends Exception{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "올바르지 않은 비밀번호입니다.";
	}

}
