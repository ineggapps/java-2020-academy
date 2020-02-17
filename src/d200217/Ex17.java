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
		//3자리의 정수의 숫자가 겹치는지 확인 겹치면 false, 겹치지 않으면 true
		if(num<100 || num >1000) {
			return false;
		}
		int n1, n2, n3;
		n1=num/100;
		n2=num/10%10;//뒤에 일의자리를 자르고 %10을 하면 본래 십의자리의 값이 나온다.
		n3=num%10;
//		System.out.println(n1+" "+n2+" "+n3);
		return n1!=n2 && n2!=n3 && n3!=n1;
	}

	public static String toComputer5() {
		//똑같은 수가 나올 수 있음.
		//맨 앞자리가 0이 나올 수 있음 (그래서 String으로 예제 진행)
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
		// 1~9 수 중에서 서로 다른 세 자리 수를 구하고자 한다면?
		// 123~987
		// 힌트1: 1~9까지 정수 하나를 발생시키기
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
