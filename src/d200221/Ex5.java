package d200221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex5 {
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
		} catch (Exception e) {
			//��� ���ܸ� ��� catch���� �ۼ��ϸ� ��������, �� ������ �߻��ߴ��� ��Ȯ�ϰԴ� �� �� �ִ�.
			//�׸��� ������ �߻��� ������ ó���� �ϱ⿡�� �ټ� ����� �� ����.
			System.out.println(e.toString());
		}	

		System.out.println("End");
	}
}
