package member;

public class NotFoundException extends Exception{

	@Override
	public String getMessage() {
		return "정보를 찾을 수 없습니다";
	}
	
}
