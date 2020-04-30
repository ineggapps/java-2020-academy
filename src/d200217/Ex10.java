package d200217;

import java.util.Calendar;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.print("날짜 [yyyy-mm-dd] ? ");
//		str = sc.next();
		str="2020-02-19";

		// 예외처리 대신 (아직 예외처리 진도 나가지 않았음)
		if (str.length() != 10 || str.split("-").length != 3) {
			System.out.println("날짜 입력 형식 오류");
			sc.close();
			return;
		}

		String[] ss = str.split("-");
		int y = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		int d = Integer.parseInt(ss[2]);
		int w,n;
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m - 1, d);
		System.out.printf("날짜: %tF\n", cal);

		Calendar sday = (Calendar) cal.clone();// 객체를 복제한다.
		//복제하였으므로 내용값은 같으나 전혀 다른 객체라고 보아야 한다. (왜냐하면 주솟값이 다른 곳에 또 다시 배정이 된 것이기 때문에)
		//Calendar sday = Calendar.getInstance();
		//sday.set(y,m-1,d); 이 2개의 줄을 실행한 것과 비슷한 효과.
		// 2020년 2월 20일을 입력하면 sday는 2월 16일을 가리키고 eday는 2월 22일을 가리켜야 한다.
		w=cal.get(Calendar.DAY_OF_WEEK);
		n=w-1;
		sday.add(Calendar.DATE, -n);
		System.out.printf("주 시작: %tF\n", sday);

		Calendar eday = (Calendar) cal.clone();// 객체를 복제한다.
		eday.add(Calendar.DATE,  7-w);//or -n+6
		System.out.printf("주 마지막: %tF\n", eday);

		sc.close();
	}
}
