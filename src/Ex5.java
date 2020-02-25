import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");

		System.out.println(list);

		int idx;
		// ���� �˻�
		idx = list.indexOf("�λ�");
		System.out.println("�λ� ��ġ: " + idx);

		// ũ�� ������ ����: Comparable �������̽��� ������ Ŭ���� ����
		Collections.sort(list);
		System.out.println("���� ��: " + list);

		// �̺� �˻� ���ĵǾ� �־�� �����ϴ�. ������ -1�� ��ȯ�Ѵ�.
		idx = Collections.binarySearch(list, "����");
		System.out.println("���� ��ġ: " + idx);

		// ���� ����
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("���� ��: " + list);

		// �̺� �˻��� �����˻����� ������ ������ �ʴ�.
		// ������ �Ǽ��� �� �� �� ���̸� �̺� �˻��� �� ������.
		// ������ �Ǽ��� �� �� ���̸� �����˻��� �� ������.
	}
}
