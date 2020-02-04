package d200204;

public class WhileEx1 {
	public static void main(String[] args) {
//		int n=0;
//		do {
//			n++;
//			System.out.println("안: "+n);
//		}while(n<10);
//		System.out.println("밖: "+n);
		
		int n, s;
		n=s=0;
		
		do {
			n++;
			s+=n;
		}while(n<10);
		System.out.println("결과: " + s);
	}
}
