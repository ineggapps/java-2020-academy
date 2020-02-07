package d200207;

import java.util.Scanner;

public class InstantQuiz2 {
	public static void main(String[] args) {
		/*
		 * 이름과 급여를 입력 받아 세금을 계산하는 프로그램 세금은 급여가 300만원 이상이면 3.3% 세금은 급여가 200만원 이상이면 2.2%
		 * 기타 급여는 0원 단, 세금은 일의자리에서 반올림한다. 예를 들어 세금이 3057이면 3060이다.
		 * 
		 * <출력> 이름 급여 세금 실수령액
		 */

		Scanner sc = new Scanner(System.in);
		String name;
		int salary, tax, income;
		// 급여가 0보다 작을 경우 종료
		do {
			System.out.print("이름 입력 > ");
			name = sc.next();
			System.out.print("급여 입력 > ");
			salary = sc.nextInt();

			tax = salary > 3000000 ? (int) (salary * 0.033) : (int) (salary * 0.022);
			System.out.println("반올림 전:" + tax);
			// 1의자리에서 반올림하기
			if (tax % 10 >= 5) {
				tax += 10;
			}
			tax -= (tax % 10);
			System.out.println("반올림 후:" + tax);

			income = salary - tax;

			System.out.print("이름\t\t\t급여\t\t\t세금\t\t\t실수령액\n");
			System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", name, salary, tax, income);
		} while (salary > 0);

		sc.close();
	}
}
