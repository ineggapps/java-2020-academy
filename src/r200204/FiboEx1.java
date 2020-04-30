package r200204;

public class FiboEx1 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, sum = 0, next, n = 1;

		System.out.printf("num1\tnum2\tsum\n");
		while (n < 8) {
			n++;
			System.out.printf("%d\t\t%d\t\t%d\n", num1, num2, num1 + num2);
			// (처음 while 진입했을 때를 기준) 
			// 다음 값을 구함과 동시에 바로 sum에 계산하여 결괏값을 집어넣으니까 연산은 총 7번만 더 하면 돼!
			// 손으로 계산하는 것과 혼동하지 않기!
			sum += next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
		System.out.println(sum);
	}
}
