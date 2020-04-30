package d200204;

public class ForEx8 {
	public static void main(String[] args) {
		//1~100까지의 수 중 3의 배수이거나 5의 배수를 한 줄에 5개씩 출력하고
		//마지막에 합과 평균을 출력
		int sum,avg,cnt;
		sum=avg=cnt=0;
		/*
		#1. 부등호 <, <=, >, >= 의 중요성 (결과가 천지차이!), 
		#2. 초깃값 지정도 중요하다.
		#3. 블록화시키기 if, while, for() 선언 후 중괄호 {} 꼭 쓰고 들여쓰기 하기
		 **/
		for(int n=1;n<=100;n++) {
			if(n%3==0 || n%5==0) {
				sum+=n;
				System.out.printf("%d\t\t",n);
				if(++cnt%5==0) {
					System.out.println();
				}
			}
		}
		if(cnt%5!=0) {
			System.out.println();
		}
		avg=sum/cnt;
		System.out.printf("합: %d\n평균: %d",sum,avg);
		
		//보너스 스테이지
		//3의 배수
		System.out.println();
		for(int n=3;n<=100;n+=3) {
			System.out.print(n+" ");
		}
		//5의 배수
		System.out.println();
		for(int n=5;n<=100;n+=5) {
			System.out.print(n+" ");
		}
	}
}
