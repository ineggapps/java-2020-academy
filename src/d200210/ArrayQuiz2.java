package d200210;

public class ArrayQuiz2 {
	public static void main(String[] args) {
		// 5행 5열의 배열에 A~Y까지 영문자를 다음과 같이 출력
		/*
		 E		J		O		Y
		 D		I		N		X
		 C		H		M		R		
		 B		G		L		Q
		 A		F		K		P
		 */
		char a[][] = new char[5][5];
		char ch = 'A';
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[a.length - 1 - j][i] = ch++;
			}
		}

		System.out.println("[실행결과]");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%c\t", a[i][j]);
			}
			System.out.println();
		}

	}
}
