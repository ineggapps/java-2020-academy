package d200204;

public class ForEx3 {
	public static void main(String[] args) {
		//for에서 변수 선언 가능하다
		for(int n=1;n<=5;n++) {
			System.out.println("안: "+n);
		}
		//오류 발생. for문에서 선언되고 for문에서만 사용되는 n의 값을 for문의 밖에서 지정할 수 없다.
//		System.out.println("밖:" + n );
	}
}
