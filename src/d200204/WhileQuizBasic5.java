package d200204;

public class WhileQuizBasic5 {
	//1+2+3+...+n까지의 합이 100을 넘는 최소의 n과 그때의 합을 구하는 프로그램
	public static void main(String[] args) {
		int n=0,sum=0;
		while(sum<=100) {//"부등호에는 =을 넣는 게 맞아요~" (100을 넘는.. 이라면 초과한다는 의미라서 <가 맞을 것 같은데...)
			n++;
			sum+=n;
		}
		System.out.println("최소의 n: "+n);
		System.out.println("합: "+sum);
	}
}
