package d200221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;

		try {
			System.out.print("ù ��° �� > ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° �� > ");
			b = Integer.parseInt(br.readLine());
			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} catch (IOException e) { // checked ����
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			// NumberFormatException: unchecked exception
			// �ݵ�� catch�� �ʿ� ������, ���ܰ� �߻��ϸ� ���α׷��� ������������ ����ȴ�.
			// ���ڿ��� ���ڷ� ������ �Ұ����� ��� �߻��Ѵ�.
//			System.out.println("���ڸ� �Է��� �����մϴ�.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// unchecked ����
			System.out.println("0���� ���� �� �����ϴ�.");
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			// Exception: ��� ���ܸ� catch�� �� ����.
			// ���� ���ܸ� catch�� ��� ���� �������� ����Ѵ�. (Exception e)s
			System.out.println(e.toString());
		}

		System.out.println("End");
	}
}
