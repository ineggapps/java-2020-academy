package d200204;

import java.util.Scanner;

public class WhileQuizBasic6 {
	//�� ������ �Է� �޾� �Է� ���� �� �� ���� ������ ū �������� ���� ���ϴ� ���α׷� �ۼ��ϱ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,num1,num2,tmp,sum=0;
		
		System.out.print("�� ��? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//num1�� num2�� ��� �Ǻ�
		//num1�� num2���� ���� ���� �ǵ��� ����
		if(num1>num2) {
			tmp=num1;
			num1=num2;
			num2=tmp;
		}
		
		n=num1;
		while(n<=num2) {//(�ε�ȣ �����ϱ�!)
			sum+= n++;
		}
		
		System.out.printf("%d~%d������ �� = %d",num1,num2,sum);
		
		sc.close();
	}
}
