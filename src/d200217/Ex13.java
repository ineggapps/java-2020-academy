package d200217;

import java.sql.Date;

public class Ex13 {
	public static void main(String[] args) {
		//생성자에는 매개변수가 없이 생성할 수 있는 생성자가 없다.
		Date date = new Date(new java.util.Date().getTime());
		System.out.println(date.toString());
		//java.util.Date()와 달리 java.sql.Date()의 경우에는 미국형식의 날짜로 출력되지 않았다.
		//이 클래스는 DB에서 날짜를 가져올 때 사용하는 클래스이므로 이외의 용도로는 잘 사용하지 않는다.
	}
}
