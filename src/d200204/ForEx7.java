package d200204;

public class ForEx7 {
	public static void main(String[] args) {
		// A~Z출력
//		for(char a='A';a<='Z';a++) {
//			System.out.printf("%c\t",a);
//		}

		// A~Z출력 (단, 한 줄에 5개씩)
		int cnt = 0;
		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.printf("%c\t", a);
			if (++cnt % 5 == 0) {
				System.out.println();
			}
		}
	}
}
