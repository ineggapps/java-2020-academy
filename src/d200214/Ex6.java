package d200214;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		// 수식을 문자열로 입력 받아 연산하는 프로그램을 작성
		// 연산은 +, -, *, /만 가능
		// 단, 숫자에는 부호가 없고 split 메서드는 사용하지 않는다.
		// 중간에 공백이 입력가능하며, 공백이 입력되었을 경우 제거 후에 연산을 수행한다.
		// 문자열에서 공백을 입력 받기 위해서는 nextLine()를 사용해야 함.
		// 선언
		Scanner sc = new Scanner(System.in);
		String s;
		int position = 0;
		// 입력
		System.out.print("수식(예: 5+3) > ");
		s = sc.nextLine();

		// 처리
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		for (String op : new String[] { "+", "-", "*", "/" }) {
			if (s.indexOf(op) > 0) {
				position = s.indexOf(op);
//				예) 123+52
//				System.out.println(position);//연산자가 있는 위치의 index (3)
//				System.out.println(s.charAt(position));//연산자가 나온다 (+)
//				System.out.println(s.substring(0, position));//연산자 앞 항 (123)
//				System.out.println(s.substring(position + 1));//연산자 뒤 항 (52)
				int n1, n2;
				n1 = Integer.parseInt(s.substring(0, position));
				n2 = Integer.parseInt(s.substring(position + 1));

				int result = 0;
				switch (op) {
				case "+":
//					System.out.printf("%d%s%d=%d",n1,op,n2,n1+n2);
					result = n1 + n2;
					break;
				case "-":
//					System.out.printf("%d%s%d=%d",n1,op,n2,n1-n2);
					result = n1 - n2;
					break;
				case "*":
					result = n1 * n2;
//					System.out.printf("%d%s%d=%d",n1,op,n2,n1*n2);
					break;
				case "/":
					result = n1 / n2;
//					System.out.printf("%d%s%d=%d",n1,op,n2,n1/n2);
					break;
				}
				System.out.printf("%d%s%d=%d%n", n1, op, n2, result);
				break;
			}
		}

		sc.close();
	}
}
