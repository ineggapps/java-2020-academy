﻿package d200203;

public class WhileEx7 {
	public static void main(String[] args) {
		int n = 0, s = 0;
		//1~10까지의 합을 구하기
		while (n < 10) {
			n++;
			s += n;
		}
		System.out.println("결과: " + s);
	}
}
