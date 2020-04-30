package d200204;

public class ForTest8 {
	//1~100까지 수 중 3의 배수를 한 줄에 10개씩 출력하고 마지막에 3의 배수 합 및 평균을 출력
	public static void main(String[] args) {
		int cnt = 0;
		int sum=0, avg=0;
		for (int n = 3; n <= 100; n += 3) {
			cnt++;
			sum+=n;
			System.out.printf("%d\t",n);
			if(cnt%10==0) {
				System.out.println();
			}
		}
		avg=sum/cnt;
		if(cnt%10!=0) {
			System.out.println();
		}
		System.out.println("합: "+sum);
		System.out.println("평균: "+avg);
	}
}
