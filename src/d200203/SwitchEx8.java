package d200203;
import java.util.Scanner;

public class SwitchEx8 {
	/*
	 * ������ �Է� �޾� ��,��,��,��,�� ���ϱ�.
	 * 
	 * (��, �Է� ���� �������� ������ ����)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		char grade;
		System.out.print("���� �Է�(1~100): ");
		s = sc.nextInt();

		switch (s / 10) {// �ذ��迬���ڴ� �� �ڸ��� �� �� ����.
		case 10:
		case 9:
			grade = '��';
			break;
		case 8:
			grade = '��';
			break;
		case 7:
			grade = '��';
			break;
		case 6:
			grade = '��';
			break;
		default:
			grade = '��';
			break;
		}

		System.out.println(s + ": " + grade);
		sc.close();
	}
}
