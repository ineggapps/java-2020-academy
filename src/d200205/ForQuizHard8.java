package d200205;

public class ForQuizHard8 {
	/*
	 * 피타고라스의 정리는 직각삼각형에서 직각을 낀 두 변의 길이를 a,b라고 하고 빗변의 길이를 c라고 하면 a^2+b^2=c^2의 수식이
	 * 성립한다. 각 변의 길이가 10보다 작거나 같은 삼각형 주엥서 피타고라스의 정리가 성립하는 직각삼각형의 개수 및 이 때의 a,b,c의 값을
	 * 출력하면? 여기서 각 변의 길이라고 하는 것은 자연수를 의미한다. 따라서 0< 변의 길이<=10 이 된다.
	 */
	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		int n,cnt=0;
		for (int a = start; a <= end; a++) {
			for (int b = start; b <= end; b++) {
				for (int c = start; c <= end; c++) {
					n=a*a+b*b;
					if(n==c*c) {
						cnt++;
						System.out.printf("a=%d, b=%d, c=%d%n",a,b,c);
					}
				}
			}
		}
		System.out.println("전체 개수: "+cnt);
	}
}
