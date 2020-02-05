import java.util.Scanner;

public class Quiz105_Max {
	public static void main(String[] args) {
/*		
		10개의 정수를 입력 받은 입력 받은 수중 가장 큰수
*/		
		Scanner sc=new Scanner(System.in);
		int n, max=0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(i==0) {
				max=n;
			} else if(max < n) {
				max=n;
			}
		}
		System.out.println("최대값 : " + max);
		sc.close();

/*
		Scanner sc=new Scanner(System.in);
		int n, max;
		System.out.println("10개의 정수를 입력 하세요...");
		max=sc.nextInt();
		for(int i=0; i<9; i++) {
			n=sc.nextInt();
			
			if(max < n) {
				max=n;
			}
		}
		System.out.println("최대값 : " + max);
		sc.close();
*/

/*		
		Scanner sc=new Scanner(System.in);
		int n, max=Integer.MIN_VALUE;
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(max < n) {
				max=n;
			}
		}
		System.out.println("최대값 : " + max);
		sc.close();
*/		
	}
}
