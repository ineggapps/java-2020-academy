package d200203;

import java.util.Scanner;

public class SwitchEx7 {
	public static void main(String[] args) {
		// �� ���ڸ� �Է� �޾� �������� �ƴ��� �Ǻ��ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		char c;

		System.out.print("���� �Է�: ");
		c = sc.next().charAt(0);

		switch (c) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println(c + ": ����");
			break;
		default:
			System.out.println(c + ": ���ڰ� �ƴ�");
			break;

		}
		
		//������ switch���� if�����ε� ǥ���� �� ���� (�� �����ϰ� ȿ����)
//		if(c>='0' && c<='9') {
//			System.out.println(c + ": ����");
//		}else {			
//			System.out.println(c + ": ���ڰ� �ƴ�");
//		}
		
		sc.close();
	}
}
