package d200225;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		// ArrayList: �߰��� ������ ����� ��� ���� ���� �߻�.
		// �˻� �ÿ� �ӵ��� ������. ����ȭ�� ���� �ʴ´�. (��Ƽ ������ ȯ�濡�� �������� ����)
		// LinkedList: �߰��� ������ ����� ��� ArrayList���� ����
		// �˻��� ����. ����ȭ�� ���� ����(��Ƽ ������ ȯ�濡�� �������� ����)

		List<String> list = new LinkedList<String>();
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");

		System.out.println(list.get(0));
	}
}
