package d200131;

import java.util.Scanner;

public class IfQuiz1 {
	//if문을 이용하여 두 수의 차를 구하되 결괏값은 양수가 되도록 하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;

		System.out.print("첫 번째 수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두 번째 수 입력: ");
		num2 = sc.nextInt();

//		해결방법 #1
//		if (num1 > num2) {
//			result = num1 - num2;
//		} else {
//			result = num2 - num1;
//		}

//		해결방법 #2
		result = num1 - num2;
		if (result < 0) {
			result = -result;
		}

		System.out.println("두 수의 차이: " + result);

		sc.close();
	}
}
