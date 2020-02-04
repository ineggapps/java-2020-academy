package d200204;

public class ForTest9 {
	public static void main(String[] args) {
		// 1~10까지의 합, 11~20까지의 합, ..., 91~100까지의 합을 구하는 프로그램 작성하기.
		int s = 0;
		for (int n = 1; n <= 100; n++) {
			s += n;
			if (n % 10 == 0) {
				System.out.printf("%d~%d까지의 합: %d\n", n - 9, n, s);
				s = 0;
			}
		}
		
		/*아래의 것에는 무한루프의 예제이다.
		 for문을 쓰나 while문을 쓰나 무한 루프(infinite loop)는 차이가 없지만, 
		 for문보다는 while(true)를 이용하여 무한 루프를 작성한다.
		 * */

//		int s,n;
//		s=n=0;
//		while(n<10) {
//			n++;
//			s+=n;
//		}
//	
//		int s=0;
//		for(int n=1;n<=10;n++) {
//			s+=n;
//		}
//		System.out.println(s);
//	
//		break: switch~case, while, do~while, for문에서 탈출하기 위해 사용한다.
//	해당되는 제어 문장을 빠져 나간다.
//		int s=0,n=0;
//		while(true) {//무한 루프
//			n++;
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
//	
//		int s=0,n=0;
//		for(;;) {
//			n++;
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
		
//		int s, n;
//		for(s=0, n=1; ; n++) {
//			s+=n;
//			if(n>=10)break;
//		}
//		System.out.println(s);
	}
}
