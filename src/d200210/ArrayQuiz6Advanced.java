package d200210;

public class ArrayQuiz6Advanced {
	public static void main(String[] args) {
		char[][] a = new char[4][4];
		char n;
		/*
		 A~Z까지 문자를 난수를 이용하여 발생하여 발생된 문자를 4X4배열에 0행 0열부터 행우선으로 대입하여 출력하는 프로그램
		 #2[심화]. 1차원배열을 사용하지 않고 2차원배열 안에서만 해결한다.
		 => label과 함께 반복문을 2번씩 써서 검증하는 작업이 필요하다.
		*/
		// 연산
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				n = (char) ((Math.random() * 26) + 65);
				a[i][j] = n;
				
				gogo:
				for(int x=0;x<=i;x++) {
					for(int y=0;y<a[x].length;y++) {
						if(x==i && y>=j) break gogo;
						if(a[i][j]==a[x][y]) {
							j--;
							break gogo;
						}
					}
				}
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
