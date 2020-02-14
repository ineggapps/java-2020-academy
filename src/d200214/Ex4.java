package d200214;

public class Ex4 {
	public static void main(String[] args) {
		String s = "seoul korea";
		System.out.println(s);

		// 문자열 길이
		System.out.println("길이: " + s.length());

		// 인덱스는 0부터 시작
		System.out.println(s.substring(6, 9));
		// substring(S,e): s인덱스에서 "e-1"인덱스까지
		// s<e이고 e<=length()이어야 한다.
		System.out.println(s.substring(6));
		// substring(S): s인덱스에서 끝까지

		char c = s.charAt(6); // 해당 인덱스의 문자
		System.out.println(c);

		System.out.println("===문자열 equal, equalsIgnoreCase 비교===");
		System.out.println(s.equals("seoul korea"));// true 문자열 비교결과
		System.out.println(s.equals("Seoul KOREA"));// false (대소문자 구분한다)
		System.out.println(s.equalsIgnoreCase("Seoul KOREA"));// true (대소문자 구분 없음)

		// 문자열이 "seoul"로 시작 여부 startsWith도 대소문자 구분한다.
		System.out.println(s.startsWith("seoul"));
		// 문자열이 "korea"로 끝나는지 여부
		System.out.println(s.endsWith("korea"));

		// "seoul korea"와 "seoul corea"는 누가 더 클까?
		// 사전식 배열(ASCII 코드 차이)
		System.out.println(s.compareTo("seoul corea"));

		// "kor"의 위치는 어디서?
		System.out.println(s.indexOf("kor"));
		System.out.println(s.indexOf("busan"));// 없으면 -1을 반환한다.

		// 처음부터 찾는다
		System.out.println(s.indexOf("o"));
		// 인덱스 3부터 찾는다.
		System.out.println(s.indexOf("o", 3));
		// 뒤에서부터 찾는다.
		System.out.println(s.lastIndexOf("o"));
	}
}
