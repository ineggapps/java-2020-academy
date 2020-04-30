import java.util.Scanner;

public class Quiz106_Min {
	public static void main(String[] args) {
/*		
		10개의 정수를 입력 받은 입력 받은 수중 가장 작은수
*/		
		Scanner sc=new Scanner(System.in);
		int n, min=0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(i==0) {
				min=n;
			} else if(min > n) {
				min=n;
			}
		}
		System.out.println("최소값 : " + min);
		sc.close();

/*		
		Scanner sc=new Scanner(System.in);
		int n, min=Integer.MAX_VALUE;
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=0; i<10; i++) {
			n=sc.nextInt();
			
			if(min > n) {
				min=n;
			}
		}
		System.out.println("최소값 : " + min);
		sc.close();
*/		
	}
}
