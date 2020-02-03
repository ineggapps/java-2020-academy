package d200203;

public class WhileEx19 {
	public static void main(String[] args) {
		//1~100까지의 합을 출력하되 수가 10의 배수가 될 때마다 합을 출력
		//1~10: 55
		//2~20: 210
		// ...
		//1~100: 5050
		
		int n=0,s=0;
		while(n++<100) {
			s+=n;
			if(n%10==0) {
				System.out.printf("%d~%d까지의 합: %d%n",1,n,s);
			}
		}
	}
}
