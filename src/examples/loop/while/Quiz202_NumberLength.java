import java.util.Scanner;

public class Quiz202_NumberLength {
	public static void main(String[] args) {
/*		
		������ �Է� �޾� �Է� ���� ���� ���� ���ϱ�
*/		
		Scanner sc = new Scanner(System.in);

		int num, len, temp;

		System.out.print("�� ? ");
		num = sc.nextInt();

		len = 1;
        temp=num;
		if(num<0)
			temp=-num;

		while(temp>=10) {
				temp=temp/10;
				len++;
		}

		System.out.println(num+"�� "+len+"�ڸ� ����");
		
		sc.close();
	}
}
