package d200218;

import java.text.NumberFormat;

public class Ex2 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();

		String s1 = "1000";
		String s2 = "1000.912";
		String s3 = "1,000";

		try {
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);

			//Number클래스를 이용하여 바로 콘솔창에 출력할 수 있음
			System.out.println(n1 + ":" + n2 + ":" + n3);

			//소수점 버림
			nf.setParseIntegerOnly(true);//소수점 버림
			n2 = nf.parse(s2);
			System.out.println(n2);
			
			//백분율 출력하기도 가능
			double d= 0.125;
			NumberFormat nf2 = NumberFormat.getPercentInstance();
			String s = nf2.format(d);
			System.out.println(s); //12% 출력됨
			
			
			
		} catch (Exception e) {
			System.out.println("예외 발생" + e.getMessage());
		}
	}
}
