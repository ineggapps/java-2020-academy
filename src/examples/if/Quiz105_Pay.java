import java.util.Scanner;

public class Quiz105_Pay {
	public static void main(String[] args) {
/*
		�ٹ��ð��� �Է� �޾� �޿��� ����ϴ� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		int pay, hours, rate = 10000;

		System.out.print("�ٹ��ð� ? ");
		hours = sc.nextInt();

		if (hours > 8) {
			pay = 8 * rate + (int) ((hours - 8) * rate * 1.5);
		} else {
			pay = hours * rate;
		}
		System.out.printf("�޿� : %,d��", pay);

		sc.close();
	}
}
