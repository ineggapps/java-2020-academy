package d200217;

import java.util.Random;

public class Ex17 {
	public static void main(String[] args) {
		System.out.printf("%d\n", toComputer());
		System.out.println(toComputer5());
		int n = toComputer();
		System.out.println(n + "=>" + isNumberFormat3(n));
		int n2 = 990;
		System.out.println(n2+"=>"+isNumberFormat3(n2));
	}
	
	public static boolean isNumberFormat3(int num) {
		//3�ڸ��� ������ ���ڰ� ��ġ���� Ȯ�� ��ġ�� false, ��ġ�� ������ true
		if(num<100 || num >1000) {
			return false;
		}
		int n1, n2, n3;
		n1=num/100;
		n2=num/10%10;//�ڿ� �����ڸ��� �ڸ��� %10�� �ϸ� ���� �����ڸ��� ���� ���´�.
		n3=num%10;
//		System.out.println(n1+" "+n2+" "+n3);
		return n1!=n2 && n2!=n3 && n3!=n1;
	}

	public static String toComputer5() {
		//�Ȱ��� ���� ���� �� ����.
		//�� ���ڸ��� 0�� ���� �� ���� (�׷��� String���� ���� ����)
		StringBuilder b = new StringBuilder();
		Random r = new Random();
		int n;
		for (int i = 0; i < 5; i++) {
//			n = (int)(Math.random()*10);
			n = r.nextInt(10);
			b.append(n);
		}
		return b.toString();
	}

	public static int toComputer() {
		// 1~9 �� �߿��� ���� �ٸ� �� �ڸ� ���� ���ϰ��� �Ѵٸ�?
		// 123~987
		// ��Ʈ1: 1~9���� ���� �ϳ��� �߻���Ű��
		Random r = new Random();
		int n1, n2, n3;

		n1 = random(r);

		do {
			n2 = random(r);
		} while (n2 == n1);

		do {
			n3 = random(r);
		} while (n3 == n1 || n3 == n2);
		return n1 * 100 + n2 * 10 + n3;
	}

	public static int random(Random r) {
		return r.nextInt(9) + 1;
	}
}
