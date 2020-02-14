package d200214;

public class Ex3 {
	public static void main(String[] args) {
		String s1 = "seoul";
		String s2 = s1;

		System.out.println(s1 == s2);// true
		s1 += "korea";// String에서의 +는 문자열을 결합하는 것이다.
		// 하지만 String은 불변의 원칙(읽기 전용)이므로 문자열을 결합하여 새로운 기억장소에 저장하고
		// 새로이 저장된 곳의 주솟값을 s1에 대입하게 된다.
		System.out.println(s1 == s2);// false
		System.out.println(s1);
		System.out.println(s2);

		Ex3 ob = new Ex3();
//		String s= ob;//String과 Ex3은 자료형이 완전 다르다.
		String s = "seoul" + ob;//"문자열"+"패키지명.클래스명@해시16진수"
		System.out.println(s);
	}
}
