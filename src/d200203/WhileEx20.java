package d200203;

public class WhileEx20 {
	public static void main(String[] args) {
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...10)의 결괏값 구하기
		
//		int n=0,m,s=0;
//		while(++n<=3) {
//			//s+=n;
//			m=0;
//			while(++m<=n) {
//				System.out.printf("%d + %d",m,n);
//				s+=m;
//			}
//		}
		
		int n,s,ss;
		n=s=ss=0;
		while(n<10) {
			n++;
			System.out.printf("s=> %d+%d=%d%n",s,n,s+n);
			s+=n;
			System.out.printf("ss=> %d+%d=%d%n",ss,s,s+s);
			ss+=s;
		}
		System.out.println("결괏값: " + ss);
	}
}
