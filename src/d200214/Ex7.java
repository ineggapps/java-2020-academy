package d200214;

public class Ex7 {
	public static void main(String[] args) {
		// 1~100까지 수를 한 줄에 10개씩 출력하되,
		// 수 중 3, 6, 9가 존재하는 경우 숫자 대신 3, 6, 9 숫자만큼 *을 출력
		// 3, 6, 9 숫자만큼 * 출력

		// 1 2 * 4 5 * 7 8 * 9 10
		// 11 ~
		// 21 ~
		// * **
		String k = "*";
		for (int i = 1; i <= 100; i++) {
			String s = Integer.toString(i);

			// 1단계) 3, 6, 9가 들어간 만큼 * 출력
			s = s.replaceAll("3|6|9", "*");
			// 2단계) *이 들어간 항목은 숫자를 제거
			// ex) 13 => 1* => *로 고쳐야 함.
			if (s.indexOf(k) >= 0) {
				s = s.replaceAll("\\d", "");
			}

			System.out.print(s + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
