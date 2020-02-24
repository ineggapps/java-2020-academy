package d200224;
import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		// ArrayList: List �������̽��� ���� Ŭ����
		// Collection �߿��� �迭�� ���� �����ϴ�.
		// �޸𸮰� ����� ������ ���������� �������� ������ �����ϴ�.
		String s;
		List<String> list = new ArrayList<>(); // ��ĳ����
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");

		System.out.println("����: " + list.size());
		//ó��
		s = list.get(0);
		System.out.println("ó��: " + s);
		//�� ��°
		s = list.get(1);
		System.out.println("�� ��°: " + s);
		//������
		s = list.get(list.size()-1);
		System.out.println("������: " + s);
		
		//ó���� �ѱ��� �߰� (����)
		list.add(0, "�ѱ�");
		s=list.get(0);
		System.out.println(list);
		
		//0��° �ε��� ����
		list.set(0, "���ѹα�");
		s=list.get(0);
		System.out.println(list);
		
		//��õ �ε�����
		System.out.println("��õ �ε���: " + list.indexOf("��õ"));
		
		//���� �ε��� -1 (�����ϱ�)
		System.out.println("���� �ε���: "+list.indexOf("����"));
		
		//�λ� ���� ����
		System.out.println("�λ� ���� ����(boolean): " + list.contains("�λ�"));
		
		//���ѹα� �����
		list.remove(0);
//		list.remove("���ѹα�"); //�Ǵ� �̷��� ����⵵ �����ϴ�. (�������� ����)
		System.out.println(list);

		System.out.println("��ü-1");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) +"\t");
		}
		System.out.println();
		System.out.println("��ü ���2");
		for(String i: list) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
