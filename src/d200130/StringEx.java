package d200130;

public class StringEx {
	public static void main(String[] args) {
		String s;
		// 문자열+ 숫자들 => 문자열 (결합)
		s = "korea" + 9 + 3;
		System.out.println(s); // korea93

		// 숫자들 + 문자열 => 숫자들의 계산 결과 + 문자열
		s = 9 + 3 + "korea";
		System.out.println(s); // 12korea

		// 문자열 + 문잣값 + 숫자 => 문자열 (결합)
		s = "korea" + 'A' + 3;
		System.out.println(s); // koreaA3

		// 문자열이 아닌 '문자'는 정수형의 값을 이용하여 계산을 시도한다.
		// 문잣값들+숫자+문자열 => 숫자들의 계산 결과 + 문자열
		s = 'A' + '0' + 3 + "korea";
		System.out.println(s);// 116korea
	}
}
