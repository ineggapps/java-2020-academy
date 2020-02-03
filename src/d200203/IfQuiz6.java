package d200203;

import java.util.Scanner;

public class IfQuiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,result;
		char op;
		
		System.out.print("두 수 입력: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.print("연산자 [+,-, *, /] 입력: ");
		op=sc.next().charAt(0);
		
		if(op!='+' && op!='-' && op!='*' && op!='/') {
			System.out.println("연산자 입력 오류입니다.");
		}else {
			//연산자 입력 오류가 발생하지 않으면
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
