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
		// s<=e이고 e<=length()이어야 한다.
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
		// ★ 문자열 비교 시 compareTo
		System.out.println(s.compareTo("seoul corea"));// k-c =8 (c에서 8칸 이동해야 k이다.)
		// 문자열은 >, <, ==와 같은 연산자로는 비교할 수 없다.

		// "kor"의 위치는 어디서?
		System.out.println(s.indexOf("kor"));// 위치가 시작하는 index부터
		System.out.println(s.indexOf("busan"));// 없으면 -1을 반환한다.

		// 처음부터 찾는다
		System.out.println(s.indexOf("o"));
		// 인덱스 3부터 찾는다.
		System.out.println(s.indexOf("o", 3));
		// 뒤에서부터 찾는다.
		System.out.println(s.lastIndexOf("o"));

		s = "우리나라 대한민국 대한독립 만세 대한의 건아";
		s = s.replaceAll("대한", "大韓");// String은 불변이므로 대입연산자로 어딘가에 기억을 시켜줘야겠지?
		// replace메서드는 정규표현식을 사용할 수 없고, replaceAll은 정규표현식을 사용할 수 있다.
		System.out.println(s);

		s = "우리123나라 대한65민국";
		s = s.replaceAll("\\d", "");// \\d: 숫자를 의미 (역슬래시는 java에서 \ escape character로인식하므로 한 번 더 기입하여 \\로 작성)
		System.out.println(s);

		s = "자바 123 스프링 345 HTML";
		s = s.replaceAll("[0-9]","");//숫자 없애기
		System.out.println(s);

		s = "자바 123 스프링 345 HTML";
		s = s.replaceAll("\\w|\\s","");//영어 및 공백 없애기
		System.out.println(s);

		s = "자바 123 스프링 345 HTML";
		s = s.replaceAll("[^0-09]","");//숫자 없애기
		System.out.println(s);
		
		//문자열을 패턴으로 분리하여 배열로 반환한다.
		//split 메서드에서도 정규식으로 표현할 수 있다.
		String[] ss="java,html,css".split(",");
		for(String a: ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(String a: ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] ss2= "010-1234-1234".split("-");
		for(String a: ss2) {
			System.out.print(a);
		}
		System.out.println();
	}
}