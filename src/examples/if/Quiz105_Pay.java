import java.util.Scanner;

public class Quiz105_Pay {
	public static void main(String[] args) {
/*
		근무시간을 입력 받아 급여를 계산하는 프로그램
*/
		Scanner sc = new Scanner(System.in);

		int pay, hours, rate = 10000;

		System.out.print("근무시간 ? ");
		hours = sc.nextInt();

		if (hours > 8) {
			pay = 8 * rate + (int) ((hours - 8) * rate * 1.5);
		} else {
			pay = hours * rate;
		}
		System.out.printf("급여 : %,d원", pay);

		sc.close();
	}
}
