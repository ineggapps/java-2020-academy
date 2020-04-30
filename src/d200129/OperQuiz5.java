package d200129;

import java.util.Scanner;
/*
 * 주행거리와 시속을 입력 받아 주행시간을 계산하는 프로그램을 작성하시오
 * [처리조건]
 * - 주행 거리와 시속의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다.
 * - 주행 거리의 단위는 km이며, 시속은 km/h이다.
 * - 주행시간은 시, 분, 초, 단위로 출력하며 초는 소수점 셋 째 자리에서 반올림하여 소수 둘 째 자까지 출력한다.
 * */
public class OperQuiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance, velocity;
		double time;
		System.out.print("주행 거리(km) ? ");
		distance = sc.nextInt();
		System.out.print("시속(km/h) ? ");
		velocity = sc.nextInt();

		// 계산 부분 (거리/속도=시간)
		time = (double) distance / velocity * 3600;

		System.out.printf("%d km => %d시간 %d분 %.2f초 소요", distance, (int) time / 3600, (int) (time / 60) % 60, time % 60);
		sc.close();
	}
}
