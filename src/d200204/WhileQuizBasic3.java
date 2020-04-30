package d200204;

public class WhileQuizBasic3 {
	//A~Z까지의 영문자를 한 줄에 5개씩 출력하는 프로그램을 작성하기
	public static void main(String[] args) {
		char a = 'A', cnt = 0;
		while (a <= 'Z') {
			cnt++;
			System.out.print(a++ + "\t");
			if (cnt % 5 == 0) {
				System.out.println();
			}
		}
	}
}
