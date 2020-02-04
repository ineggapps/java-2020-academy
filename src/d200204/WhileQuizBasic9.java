package d200204;

public class WhileQuizBasic9 {
	//TODO: 면접 기출
	//피보나치수열 1+1+2+3+5+8+13+21
	public static void main(String[] args) {
		//짜깁기용
		int a=1,b=1,c,s,n;
		
		n=2;
		s=2;
		while(n<8) {
			System.out.println(a+","+b);
			c=a+b;
			s+=c;
			a=b;
			b=c;
			n++;
		}
//		int n=1, sum=0;
//		int prev=0;
//		
//		System.out.printf("prev\t\tn\t\tsum\n");
//		while(n<=21) {
//			System.out.printf("%d\t\t%d\t\t%d\t\t(n=%d)%n",prev,n,prev+n,n);
//			sum+=n;
//			System.out.printf("%d+%d=%d%n",prev,n,n+prev);
//			n=prev+n;
//			prev=n;
//		}
//		System.out.println("결과: "+sum);
	}
}
