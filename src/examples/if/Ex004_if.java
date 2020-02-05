import java.util.Scanner;

public class Ex004_if {
	public static void main(String[] args) {
/*
		세수를 입력 받아 크기순으로 출력하는 프로그램
*/
		Scanner sc=new Scanner(System.in);
		
		int a, b, c, temp;

		System.out.print("첫번째 수 ? ");
		a = sc.nextInt();
		System.out.print("두번째 수 ? ");
		b = sc.nextInt();
		System.out.print("세번째 수 ? ");
		c = sc.nextInt();

		if(a>b) {
			temp = a;	a = b;	b = temp;
		}

		if(a>c) {
			temp = a;	a = c;	c = temp;
		}

		if(b>c) {
			temp = b;	b = c;	c = temp;
		}
		System.out.println("결과 : " + a + "  " + b + "  " + c);
		
		sc.close();
	}
}
