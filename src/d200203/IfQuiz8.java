package d200203;

import java.util.Scanner;

public class IfQuiz8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int midScore, finalScore, ab, reportScore;
		int midResult = 0, finalResult = 0, atResult = 0, reportResult = 0;
		int total = 0;
		String stuNum, name;
		char grade;

		System.out.print("�й�? ");
		// 00�й��� ���� �� �ִ�. cf)�����ȣ, ��ȭ��ȣ, ���¹�ȣ, �ſ�ī���ȣ �� ���ڿ��� �Է¹޴� ���� ������ �Ѵ�.
		stuNum = sc.next();
		System.out.print("�̸�? ");
		name = sc.next();
		System.out.print("�߰���� ����? ");
		midScore = sc.nextInt();
		System.out.print("�⸻��� ����? ");
		finalScore = sc.nextInt();
		System.out.print("�Ἦ Ƚ��? ");
		ab = sc.nextInt();
		System.out.print("����Ʈ ����? ");
		reportScore = sc.nextInt();


		// �⼮���� ���
		if (ab >= 6) {
			atResult = 0;
		} else if (ab >= 4) {
			atResult = 60;
		} else if (ab >= 2) {
			atResult = 80;
		} else {
			atResult = 100;
		}

//		if (ab >= 0 && ab <= 1) {
//			atResult = 100;
//		} else if (ab >= 2 && ab <= 3) {
//			atResult = 80;
//		} else if (ab >= 4 && ab <= 5) {
//			atResult = 50;
//		} else if (ab >= 6) {
//			atResult = 0;
//		}

		total += midResult += midScore * 0.4;
		total += finalResult += finalScore * 0.4;
		total += atResult *= 0.1;
		total += reportResult += reportScore * 0.1;

		if (total >= 90) {
			grade = 'A';
		} else if (total >= 80) {
			grade = 'B';
		} else if (total >= 70) {
			grade = 'C';
		} else if (total >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("�й�\t�̸�\t�߰����\t�⸻���\t�⼮����\t����Ʈ\t\t�ջ�����\t����");
		System.out.format("%s\t%s\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%c", 
				stuNum, name, midResult, finalResult, atResult,reportResult, total, grade);

		sc.close();

	}
}
