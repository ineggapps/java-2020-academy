package d200225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("����");
		list1.add("�λ�");
		list1.add("�뱸");

		List<String> list2 = new ArrayList<String>();

		list2.add("����");
		list2.add("���");
		list2.add("���");

		// list2�� list1�� ��� �����͸� �߰��ϱ�
		list2.addAll(list1);
		System.out.println(list2);

		// List���� String�迭�� ��ȯ�ϱ�
		String[] ss = list2.toArray(new String[list2.size()]);
		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();

		//String�迭���� List�� ��ȯ�ϱ�
		List<String> list3 = Arrays.asList(ss);
		System.out.println("����Ʈ ��ȯ ��: " + list3);
		
		//subList(a,b): a�ε������� b-1�κ��� List�� �����ϱ�
		List<String> list4= list2.subList(2, 4); //2,3��° �ε����� �ڷḦ ����
		System.out.println(list4);
		
		//��ü ����
		list1.clear();
		System.out.println(list1.size());
		
		//list3�� ���, ����, �λ� ����
		System.out.println("���� ��: "+list2);
		list2.subList(2, 5).clear();//�ε��� 2, 3, 4 ����
		System.out.println("���� ��: "+list2);
	}
}
