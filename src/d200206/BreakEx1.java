package d200206;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		//������ �Է� �޾� �Է� ���� ���� �� ���ϱ�
		//��, �Է� ���� ���� 0�̸� ���α׷� ����
		Scanner sc = new Scanner(System.in);
		int n,s=0;
		
		System.out.print("���� �Է�[����: 0] ? ");
		while(true) {
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			s+=n;
		}
		System.out.println("���: "+ s);
		sc.close();
	}
}
