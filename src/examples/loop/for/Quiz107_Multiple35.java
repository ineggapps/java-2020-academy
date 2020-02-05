import java.util.Scanner;

public class Quiz107_Multiple35 {
	public static void main(String[] args) {
/*
		 두 개의 정수를 입력받아 입력 받은 수중 
		 적은수에서 큰수 사이(두 정수를 포함)의 
		 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력
*/
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, temp;
		int s, cnt;
		
		System.out.print("두정수 ? ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		if(n1>n2) {
			temp=n1; n1=n2; n2=temp;
		}
		
		s=cnt=0;
		for(int i=n1; i<=n2; i++) {
			if(i%3==0 || i%5==0) {
				s+=i;
				cnt++;
			}
		}
		
		System.out.println("합:"+s);
		System.out.println("평균:"+(s/cnt));		
		sc.close();
	}
}
