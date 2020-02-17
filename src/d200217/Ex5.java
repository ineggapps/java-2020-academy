package d200217;

import java.util.Calendar;

public class Ex5 {
	public static void main(String[] args) {
		// Calendar: 추상클래스(미완성 클래스)임에 유의하자!
		// 그래서 객체를 생성할 수 없으나 객체를 생성하기 위해서 Calendar.getInstance()라는 준비된 메서드가 있음.
//		Calendar c = new Calendar(); 컴파일 오류
		// 객체를 생성할 수 없으므로 new Calendar() 따위의 선언은 불가능하다

		// 객체 생성 방법
		// 현재 컴퓨터 시스템 기준으로 날짜, 시간을 생성한다.
		// 1) Calendar cal = Calendar.getInstance();
		// 2) Calendar cal = new GregorianCalendar();
		// 3) GregorianCalendar cal = new GregorianCalendar();
		// GregorianCalendar : Calendar 클래스의 하위 클래스

		Calendar cal = Calendar.getInstance();
		// 추상클래스는 업캐스팅하여 사용할 수 있다. (!!)
		Father f = new Son();
		f.greet(); // 업캐스팅 예제

//		String s = String.format("%tF %tA %tT", cal, cal, cal);
		String s = String.format("%1$tF %1$tA %1$tT", cal);
		// $숫자는 %바로 뒤에 온다는 것도 기억.
		System.out.println(s);

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;// 월은 인덱스 개념으로 0~11까지로 반환해 준다.
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);// 일요일은 1, 토요일은 7로 반환한다.
		String[] ww = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.printf("%d년 %d월 %d일 %s요일", y, m, d, ww[w - 1]);// 일요일 값이 1인데 배열의 인덱스는 0이니까 w-1 수식으로 계산한다.

		int days = cal.getActualMaximum(Calendar.DATE);
		System.out.println("이번 달은 " + days + "일까지 있습니다.");
	}
}

abstract class Father {
	int value;

	public abstract void greet();
}

class Son extends Father {
	@Override
	public void greet() {
		System.out.println("hello");
	}
}