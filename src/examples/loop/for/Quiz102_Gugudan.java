import java.util.Scanner;

public class Quiz102_Gugudan {
	public static void main(String[] args) {
/*		
		단을 입력 받아 입력받은 단의 구구단을 출력
*/		
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.print("단 ? ");
			n=sc.nextInt();
		} while(n<1||n>9);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		
		sc.close();
	}
}
