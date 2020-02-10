package d200210;

public class ArrayQuiz6 {
	public static void main(String[] args) {
		char[][] a = new char[4][4];
		char c[] = new char[a.length * a[0].length];// 2차원배열을 펼쳐 전개한다.
		char n;
		/*
		 A~Z까지 문자를 난수를 이용하여 발생하여 발생된 문자를 4X4배열에 0행 0열부터 행우선으로 대입하여 출력하는 프로그램
		 쉬운 방법#1(현재). 1차원배열로 4X4=16이라는 크기의 배열을 만들고 중복 없이 문자열을 삽입한다.
		*/
		// 연산
		for (int i = 0; i < c.length; i++) {
//			c[i] = (char)((int)(Math.random()*26)+65);
			c[i] = (char) ((Math.random() * 26) + 'A');
			// 중복 검사
			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					i--;
					break;
				}
			}
		}
		// 대입
		int idx=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = c[idx++];
			}
		}
		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%4c\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
