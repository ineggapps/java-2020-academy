﻿package d200203;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("영어로 요일(mon, tue, wed, thu, fri, sat, sun) 입력: ");
		s = sc.next();
		// s는 7.0부터 가능합니다.
		switch (s) {
		case "mon":
			System.out.println("월요일");
			break;
		case "tue":
			System.out.println("화요일");
			break;
		case "wed":
			System.out.println("수요일");
			break;
		case "thu":
			System.out.println("목요일");
			break;
		case "fri":
			System.out.println("금요일");
			break;
		case "sat":
			System.out.println("토요일");
			break;
		case "sun":
			System.out.println("일요일");
			break;
		}
		sc.close();
	}
}
