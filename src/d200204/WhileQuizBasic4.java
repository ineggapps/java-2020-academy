package d200204;

public class WhileQuizBasic4 {
	public static void main(String[] args) {
		//1~100까지의 수 중 3 또는 5의 배수의 합과 평균을 구하는 프로그램 작성하기
		int n=0,cnt=0,sum=0,avg=0;
		while(n<100) {
			n++;
			if(n%3==0 || n%5==0) {
				sum+=n;
				cnt++;
			}
		}
		avg=sum/cnt;
		System.out.println("합: "+sum);
		System.out.println("평균: "+avg);
	}
}
