package d200204;

public class WhileQuizHard1 {
	public static void main(String[] args) {
		//1-2+3-4... 연산에서 연산 결과가 100 이상이 되는 최소의 수와 그 때의 합을 출력하는 프로그램
		//100 이상이 되는 최소의 수가 된다는 의미는 반복문은 100 미만일 경우에만 돌아가야 한다는 이야기이다.
		//(헷갈리면 수직선 상에 그려볼 것)
		int n=0,s=0;
		while(s<100) {
			System.out.printf("s=%d+%d%n",s,n+1);
			n++;
			//삼항연산자를 사용하여 짝수면 부호를 바꾸어 준다.
			s+= (n&1)==1?n:-n;
//			한 번에 계산하면 마지막에 항상 1이 큰 수를 빼니까 결과가 음수 => 결국엔 무한루프
//			System.out.printf("s=%d+%d%n",s,n+1);
//			s+= (++n);
//			System.out.printf("s=%d-%d%n",s,n+1);
//			s-= (++n);
//			if(n==10)
//			break;
		}
		System.out.printf("n: %d, s: %d",n,s);
	}
}
