import java.util.Scanner;

public class Quiz103_EvenOdd {
	public static void main(String[] args) {
/*		
		10개의 정수를 입력 받은 입력 받은 수에 짝수와 홀수 개수
*/		
		Scanner sc=new Scanner(System.in);
		int input, even, odd;
		
		even=odd=0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=0; i<10; i++) {
			input=sc.nextInt();
			
			if(input%2==0)
				even++;
			else
				odd++;
			
		}
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);
		
		sc.close();
	}
}
