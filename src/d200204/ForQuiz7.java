package d200204;

import java.util.Scanner;

public class ForQuiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, tmp;
		int sum = 0, avg = 0, cnt = 0;
		// 입력
		System.out.print("두 정수 ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.printf("%d %d가 입력%n",num1,num2);
		// 정렬 num1<num2 가 되도록
		if (num1 > num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.printf("%d %d가 정렬%n",num1,num2);

		// 연산
		//입력 받은 두 정수 사이의 수와 두 정수를 포함해야 함. 따라서 조건식의 부등호는 <가 아니라 <=가 되어야 함.
		for (int i = num1; i <= num2; i++) {
			//3의 배수이거나 5의 배수인 수들의 합과 평균만 구하기
			if(i%3==0 || i%5==0) {				
				sum += i;
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
		sc.close();
	}
}
