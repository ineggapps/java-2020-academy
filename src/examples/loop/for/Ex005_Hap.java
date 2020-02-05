public class Ex005_Hap {
	public static void main(String[] args) {
/*
		1~10 까지 정수의 합을 구하는 프로그램
*/	
		int s, n;
		s=0;
		for(n=1; n<=10; n++) {
			s+=n;
			// System.out.print(n+":"+s+"  ");
			//  1:1  2:3  3:6  4:10  5:15  6:21  7:28  8:36  9:45  10:55
		}
		System.out.println("결과 : "+s);
		// System.out.println(" out ->"+n+":"+s); // 11:55
		
/*		
		int s=0;
		for(int n=1; n<=10; n++) { // for문 안에서 변수 선언
			s+=n;
		}
		// System.out.println(n); // 컴파일 오류. for문에서 선언한 변수는 외부 사용 불가
		System.out.println("결과 : "+s);
*/

/*		
		int s, n;
		for(n=1, s=0; n<=10; s+=n, n++)
			;
		
		System.out.println("결과 : "+s);
*/
	}
}
