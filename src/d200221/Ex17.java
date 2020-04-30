package d200221;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		int n;
		//JDK7 이상 버전부터 사용 가능한 문법.
//		try(리소스 객체) 언급하면 자동으로 리소스가 close(sc.close())됨.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("나이 ? ");
			n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
