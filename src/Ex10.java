import java.util.Set;
import java.util.TreeSet;

public class Ex10 {
	public static void main(String[] args) {
		// Set: �ߺ��� ������� �ʴ´�.
		// TreeSet:�����Ѵ�. Comparable ���� Ŭ������ �����ϴ�.
		// ���� �ӵ��� �ſ� ������

		Set<String> set = new TreeSet<String>();

		set.add("����");
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����");// ���õȴ� �ߺ��� ������� �����ϱ�.

		System.out.println(set);

		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();

	}
}
