package d200130;

public class ShiftEx1 {
	public static void main(String[] args) {
		int a=126;
		int b;
		b= a<<2;//a*2^2
		System.out.println(b);
		
		b= a<<2;//a*2^-2
		System.out.println(b);
		
		a= -32;
		b=a>>3;//a가 가진 정보를 8로 나눈 몫을 구하는 것과 동일하다. 음수의 경우에는 부호비트인 1이 계속해서 채워진다.
		System.out.println(b);
		
		a = -32;
		b=a>>>3;//a가 가진 정보를 8로 나눈 몫을 구하는 것과 동일하다. 하지만 음수의 경우에는 
		System.out.println(b);
	}
}
