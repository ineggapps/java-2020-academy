package d200204;

public class ForQuiz8 {
	public static void main(String[] args) {
		//두 개의 주사위를 던져 두 주사위의 눈의 합이 9가 되는 경우를 모두 출력하는 프로그램
		int sum;
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				sum=a+b;
				if(sum==9) {
					System.out.printf("[%d, %d]%n",a,b);
				}
			}			
		}
	}
}
