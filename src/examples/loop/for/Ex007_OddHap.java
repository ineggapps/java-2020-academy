﻿public class Ex007_OddHap {
	public static void main(String[] args) {
/*
		1~100 까지 수 중 홀수의 합을 구하는 프로그램
*/	
		int s, n;
		s=0;
		for(n=1; n<=100; n+=2) {
			s+=n;
		}
		
		System.out.println("결과 : "+s); // 2500
		// System.out.println(n); // 101
	}
}
