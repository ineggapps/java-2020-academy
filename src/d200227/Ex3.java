package d200227;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		// Shuffle ���� 3
		// ArrayList ��ü�� ���� shuffle �����ϱ�
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("spring");
		list.add("html");
		list.add("css");
		list.add("javascript");

		System.out.println(list);

		String s;
		int n;

		// Shuffle �˰��� ����
		for (int i = 0; i < list.size(); i++) {
			n = (int) (Math.random() * list.size());
			if (n != i) {// ���� �迭�� �ε���i���� �̵���Ű���� �ε��� n���� ���� ������
				s = list.get(i);
				list.set(i, list.get(n));
				list.set(n, s);
			} else {// i�� n�� ���� �ڸ��̸� �ǹ̾����ϱ� �ٽ� �� �� �� �����ϵ��� �����ϸ� ���� �˰����� �� �� ����ȴ�.
				i--;
			}
		}
		System.out.println(list);
	}
}
