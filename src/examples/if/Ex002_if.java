﻿import java.util.Scanner;

public class Ex002_if {
	public static void main(String[] args) {
/*
		정수를 입력 받아 입력 받은 수가 홀수인지 판별하는 프로그램
*/
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("정수 ? ");
		n=sc.nextInt();
		
		if(n%2==1) {
			System.out.println(n + " : 홀수");
		}
		
/*
		if((n&1)==1) {
			System.out.println(n + " : 홀수");
		} 
*/		
		sc.close();
	}
}
