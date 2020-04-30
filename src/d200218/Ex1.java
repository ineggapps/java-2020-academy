package d200218;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex1 {
	public static void main(String[] args) {
		int n = 1234567;
		String s;

		System.out.println(String.format(Locale.UK, "%,d", 999999));
		s = String.format("%,d", n);
		System.out.println(s);

		NumberFormat nf = NumberFormat.getInstance();
		s = nf.format(n);// 그저 format이라는 메서드에 n을 보냈을 뿐인데 ,(comma)가 찍히네?
		System.out.println(s);
		s = "1,234,567,890";
		try {
//			Number ob = nf.parse(s);
//			Integer ob = Integer.parseInt(nf.parse(s).toString());
			Long ob = (Long) nf.parse(s);
			long x = ob + 10;
			System.out.println(x);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		double d = 13456.262626262626;
		s = nf.format(d);// 소숫점 3자리까지만 보임. 4째 자리에서 반올림
		System.out.println(s);

		NumberFormat nf2 = NumberFormat.getCurrencyInstance();// 통화 기호를 찍어 주는 Instance객체
		s = nf2.format(n);// 운영체제 국가 설정에 맞게 통화기호가 자동으로 찍힘
		System.out.println(s);

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);// 통화 기호를 찍어 주는 Instance객체
		s = nf3.format(n);// Locale을 US로 고정하였으므로 어떠한 국가 설정이든 US 통화기호가 출력된다.
		System.out.println(s);

	}
}
