package d200131;

import java.util.Scanner;

public class OperEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a, b;
		System.out.print("���� �ϳ� �Է�? ");
		a = sc.next().charAt(0);
		// �� ���ڸ� �Է� �޾� �ҹ����̸� �빮�ڷ�, �빮���̸� �ҹ��ڷ� ����ϴ� ���
		// 65 => 97 (97-65=32)
		// �빮�� -> �ҹ���, �ҹ���-> �빮��, ��Ÿ -> ��Ÿ
		// �빮���̸� 32�� ���Ͽ� �ҹ��ڷ� ��ȯ�ϰ� �ҹ����̸� 32�� �����Ͽ� �빮�ڷ� ��ȯ�Ѵ�.
		//b = a >='A' && a<= 'Z' ? (char) (a + 32) : (char)(a - 32);
		//�� �빮�� �̿��� ��� ���ڿ��� 32��ŭ�� ���� �����̹Ƿ� �ǵ��� ���� �ʴ�.
		b = a >='A' && a<= 'Z' ? 
				(char) (a + 32) : //�빮���ΰ�? true
				a>='a' && a<='z' ? //�빮���ΰ�? false�� �� �ٽ� ���� ��
						(char)(a - 32): a; //�ҹ����ΰ�? true:false
		System.out.println(a + " �� " + b); 

		sc.close();
	}
}
