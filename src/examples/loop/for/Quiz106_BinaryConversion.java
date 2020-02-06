import java.util.Scanner;

public class Quiz106_BinaryConversion {
	public static void main(String[] args) {
/*
		������ �Է� �޾� 2������ ��ȯ�ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);

		int num;
		System.out.print("���� ? ");
		num = sc.nextInt();
		
		System.out.printf("%1$d(%1$#X) => ", num);
		for(int i = 0; i < 32; i++) {
			if(i != 0 && i % 4 == 0)
				System.out.print(" ");
			System.out.printf("%c", (num << i & 0x80000000)  != 0 ? '1' : '0');
		}
		System.out.println();
		sc.close();
	}
}
