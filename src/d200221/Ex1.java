﻿package d200221;

import java.util.Scanner;

//예외 상황 시나리오
//1. 정수가 아닌 문자나 소숫점을 입력
//2. b에 0을 입력 (0으로 나눔)
//3. int형 범위를 초과하는 21억 이후의 값을 입력

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("두 정수 입력 > ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a / b;
		System.out.println(a + "/" + b + "=" + c);
		System.out.println("유효하지 않은 입력입니다.");
		System.out.println("연산이 종료되었습니다.");
		sc.close();
	}
}
