package d200214;

public class Ex7 {
	public static void main(String[] args) {
		// 1~100���� ���� �� �ٿ� 10���� ����ϵ�,
		// �� �� 3, 6, 9�� �����ϴ� ��� ���� ��� 3, 6, 9 ���ڸ�ŭ *�� ���
		// 3, 6, 9 ���ڸ�ŭ * ���

		// 1 2 * 4 5 * 7 8 * 9 10
		// 11 ~
		// 21 ~
		// * **
		String k = "*";
		for (int i = 1; i <= 100; i++) {
			String s = Integer.toString(i);

			// 1�ܰ�) 3, 6, 9�� �� ��ŭ * ���
			s = s.replaceAll("3|6|9", "*");
			// 2�ܰ�) *�� �� �׸��� ���ڸ� ����
			// ex) 13 => 1* => *�� ���ľ� ��.
			if (s.indexOf(k) >= 0) {
				s = s.replaceAll("\\d", "");
			}

			System.out.print(s + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
