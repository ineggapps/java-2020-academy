package d200203;

import java.util.Scanner;

public class IfQuiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,result;
		char op;
		
		System.out.print("�� �� �Է�: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.print("������ [+,-, *, /] �Է�: ");
		op=sc.next().charAt(0);
		
		if(op!='+' && op!='-' && op!='*' && op!='/') {
			System.out.println("������ �Է� �����Դϴ�.");
		}else {
			//������ �Է� ������ �߻����� ������
			if(op=='+') {
				result = num1+num2;
			}
			else if(op=='-') {
				result = num1-num2;
			}
			else if(op=='*') {
				result = num1*num2;
			}
			else {
				result = num1/num2;
			}
			System.out.printf("%d %c %d = %d",num1,op,num2,result);
		}
		
		sc.close();
	}
}
