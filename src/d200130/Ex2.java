package d200130;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("국어점수?");
		s=sc.nextLine();
		int num = Integer.parseInt(s);
		//s는 문자열인 String형으로 반환을 받았으므로 정수로 변환하는 작업이 필요하다.
		//이때 문자열의 숫잣값을 정수형태로 변환하는 것을 Integer.parseInt()메서드를 이용하여 작업을 수행한다.
		//String s와 관련된 명령줄을 지우고 int num = sc.nextInt();로 구성해도 된다. 
		System.out.println(num);
		sc.close();
	}
}