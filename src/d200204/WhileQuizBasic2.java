package d200204;

public class WhileQuizBasic2 {
	//1-2+3-4+...+9-10 (if가 없어도 작성이 가능하다)
	public static void main(String[] args) {
		int n=0,s=0;
		while(n<10) {
			//반복문에 n증감을 1번만 하라는 법은 없지.
			n++;
			s+=n;
			n++;
			s-=n;
		}
		System.out.println("합: "+s);
	}
}
