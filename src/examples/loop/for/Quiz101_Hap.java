import java.util.Scanner;

public class Quiz101_Hap {
	public static void main(String[] args) {
/*		
		정수를 입력 받아 입력 받은 수까지 합구하기
*/		
		Scanner sc=new Scanner(System.in);
		int s, n;
		
		do {
			System.out.print("수 ? ");
			n=sc.nextInt();
		} while(n<1||n>1000);
		
		s=0;
		for(int i=1; i<=n; i++) {
			s+=i;
		}
		System.out.println("1~"+n+"까지 합 : " + s);
		
		sc.close();
	}
}
