package r200204;

public class FiboEx1 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, sum = 0, next, n = 1;

		System.out.printf("num1\tnum2\tsum\n");
		while (n < 8) {
			n++;
			System.out.printf("%d\t\t%d\t\t%d\n", num1, num2, num1 + num2);
			// (ó�� while �������� ���� ����) 
			// ���� ���� ���԰� ���ÿ� �ٷ� sum�� ����Ͽ� �ᱣ���� ��������ϱ� ������ �� 7���� �� �ϸ� ��!
			// ������ ����ϴ� �Ͱ� ȥ������ �ʱ�!
			sum += next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
		System.out.println(sum);
	}
}
