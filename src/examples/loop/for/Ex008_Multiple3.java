public class Ex008_Multiple3 {
	public static void main(String[] args) {
/*
		1~100 까지 수 중 3의 배수를 한 줄에 10개씩 출력하고
		마지막에 3의 배수 합을 출력하는 프로그램
*/
		int s, cnt;
		s=cnt=0;
		for(int n=3; n<=100; n+=3) {
			s+=n;
			System.out.printf("%5d", n);
			cnt++;
			if(cnt%10==0)
				System.out.println();
		}
		System.out.println("\n합 : "+s);
		System.out.println("평균 : "+(s/cnt));
		
	}
}
