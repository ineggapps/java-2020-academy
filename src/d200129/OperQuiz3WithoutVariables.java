package d200129;

import java.util.Scanner;
/* �ݾ��� �Է� �޾�, �Է� ���� �ݾ��� 50000�� �ǿ��� 1���� ������ ȭ��ż��� ����ϴ� ���α׷��� �����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
 * [ó������]
 * �ݾ��� �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�.
 * �ݾ��� 70000���� ��� ȭ���� �ż��� 50000�� �� 1��, 10000�� �� 2��ó�� ū ���� �ݾ׺��� ����ϰ� �������� ���� ���� ȭ�󿡼� ����Ѵ�.
 * */
public class OperQuiz3WithoutVariables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("�ݾ� ? ");
		money = sc.nextInt();

		System.out.printf("��������: %d\n", (money/50000));
		System.out.printf("������: %d\n",  (money%50000)/10000);
		System.out.printf("��õ����: %d\n", (money%10000)/5000 );
		System.out.printf("õ����: %d\n", (money%5000)/1000);
		System.out.printf("�������: %d\n", (money%1000)/500);
		System.out.printf("�����: %d\n", (money%500)/100);
		System.out.printf("���ʿ���: %d\n", (money%100)/50);
		System.out.printf("�ʿ���: %d\n", (money%50)/10);
		System.out.printf("������: %d\n", (money%10)/5);
		System.out.printf("�Ͽ���: %d\n", money%5);
		
		sc.close();
	}
}
