package d200204;

public class ForEx2 {
	public static void main(String[] args) {
		int n;
		//숫자를 지정하여 범위를 지정하는 반복문은 while보다는 for문이 더 쉽다.
//		for (n = 1; n < 10; n+=2) {
//			System.out.println("안: " + n);//1 3 5 7 9
//		}
//		System.out.println("밖: " + n);//11
		
		for(n=2;n<=10;n+=2) {
			System.out.println("짝수: "+n);
		}
		System.out.println("종료됐을 때의 n값: "+n);
	}
}
