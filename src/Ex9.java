import java.util.LinkedHashSet;
import java.util.Set;

public class Ex9 {
	public static void main(String[] args) {
		//Set: �ߺ� ������� ����. ���� ����
		//LinkedHashSet: ������ �����Ѵ�.
		
		Set<String> set =new LinkedHashSet<String>();
		
		set.add("����");
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����");//���õȴ�
		
		//�Է��� ���� �״�� �����Ѵ�.
		System.out.println(set);
		
		//��ü ���. ���� for��
		for(String s: set) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
