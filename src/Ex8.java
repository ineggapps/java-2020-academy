import java.util.HashSet;
import java.util.Set;

public class Ex8 {
	public static void main(String[] args) {
		// Set: �ߺ� ��� �� ��. ������ ����.(HashSet)
		Set<String> set = new HashSet<String>();

		set.add("����");
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����");//���� ������ �����.
//		list.add�� ������ ������ 2���� ��ϵǾ� �������̴�
		
		System.out.println(set);
		//set�� ������ ������� ��µȴ�.
		//HashSet ��ü�� Hash������ �����ϴ� �Ŵϱ� �׷�����!
		
		//��ü ���, ���� for��
		for(String s: set) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
