package d200204;

public class WhileQuizBasic3 {
	//A~Z������ �����ڸ� �� �ٿ� 5���� ����ϴ� ���α׷��� �ۼ��ϱ�
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
