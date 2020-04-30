package d200207;

public class ArrayEx6 {
	public static void main(String[] args) {
		/*
		 * 4380원을 500원, 100원, 50원, 10원짜리로 지불하기 위해서 필요한 동전의 개수를 구하는 프로그램. 배열을 이용하기
		 */
		int m = 4380;
		int[] u = new int[] { 500, 100, 50, 10 };
		int tmp;
		System.out.printf("금액: %d\n",m);
		//작성한 답안
//		for (int i = 0; i < u.length; i++) {
//			tmp = m/u[i];
//			System.out.printf("%d원: %d장\n",u[i],tmp);
//			m-=u[i]*tmp; //====이것은 곧 나머지연산과 동일함.
//		}
		int x;
		for(int n:u) {
			x= m/n;
			System.out.printf("%d원: %d장\n",n,x);
			m%=n;
		}
	}
}
