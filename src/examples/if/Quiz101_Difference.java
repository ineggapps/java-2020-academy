import java.util.Scanner;

public class Quiz101_Difference {
	public static void main(String[] args) {
/*
		두정수를 입력 받아 큰수에서 적은수와의 차이를 구하는 프로그램

		d=n1-n2를 한후 d를 절대값을 계산해도 가능
*/
		Scanner sc=new Scanner(System.in);
		int n1, n2, d;
		
		System.out.print("첫번째수 ? ");
		n1=sc.nextInt();
		
		System.out.print("두번째수 ? ");
		n2=sc.nextInt();
		
		if(n1>n2) {
			d=n1-n2;
		} else {
			d=n2-n1;
		}
		
		System.out.println("두수의 차이 : " + d);
		
		sc.close();
	}
}
