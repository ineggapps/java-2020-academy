package d200214;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		// ������ ���ڿ��� �Է� �޾� �����ϴ� ���α׷��� �ۼ�
		// ������ +, -, *, /�� ����
		// ��, ���ڿ��� ��ȣ�� ���� split �޼���� ������� �ʴ´�.
		// �߰��� ������ �Է°����ϸ�, ������ �ԷµǾ��� ��� ���� �Ŀ� ������ �����Ѵ�.
		// ���ڿ����� ������ �Է� �ޱ� ���ؼ��� nextLine()�� ����ؾ� ��.
		// ����
		Scanner sc = new Scanner(System.in);
		String s;
		int position = 0;
		// �Է�
		System.out.print("����(��: 5+3) > ");
		s = sc.nextLine();

		// ó��
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		for (String op : new String[] { "+", "-", "*", "/" }) {
			if (s.indexOf(op) > 0) {
				position = s.indexOf(op);
//				��) 123+52
//				System.out.println(position);//�����ڰ� �ִ� ��ġ�� index (3)
//				System.out.println(s.charAt(position));//�����ڰ� ���´� (+)
//				System.out.println(s.substring(0, position));//������ �� �� (123)
//				System.out.println(s.substring(position + 1));//������ �� �� (52)
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
