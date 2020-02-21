package d200221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String[] args) {
		// BufferedReader < �� Ű����θ� �Է����޴� ���� �ƴϴ�.
		// �ٸ� �������� �Է¹޴´ٰ� ������ ��·�� �Է� �ÿ��� ��� ���� ��Ȳ�� �߻��� ������ ������ �ִ�.
		// ex) ä������ ���� ���� �ؽ�Ʈ ������ => ���߿� ���ͳ� ������ �������� ���� ��Ȳ�� �߻�
		// �׷��� ������ BufferedReader�� readLine�� IOException�� ���� ����ó���� �䱸�Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		int a, b, c;

		try {
			// br.readLine()���� checked exception�� �߻��ϹǷ� �ݵ�� ����ó���� �ʿ��ϴ�.
			// IOException ����ó���� �Ѵ�.
			System.out.print("ù ��° �� ? ");
			s = br.readLine();
			a = Integer.parseInt(s);

			System.out.print("�� ��° �� ? ");
			s = br.readLine();
			b = Integer.parseInt(s);

			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} catch (IOException e) {
			// IOException: ����¿� ������ �߻��� �� �߻��ϴ� ����
			// checked exception���� �ݵ�� ���� ó���� �ؾ� �Ѵ�.
			// checked exception�� �޼��带 ������ �� throws�� �����̴�.
			// ���� ó���� ���� ������ ������ ������ �߻��Ѵ�.
			// ��, checked exception�� �߻��� ����(throws��) �ڵ尡 ������ try-catch ��Ͽ� ������ ����.
			e.printStackTrace();
		}
		System.out.println("end~");

	}

}
