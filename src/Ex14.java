import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14 {
	public static void main(String[] args) {
		// Map: Ű->�� ����
		// Ű�� �ߺ��� ������� �ʰ� ������ ����
		// HashMap:����ȭ�� �������� �ʴ´�.
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map�� �� �����ϱ�
		map.put("����", 1000);
		map.put("�λ�", 350);
		map.put("�뱸", 250);
		map.put("��õ", 300);
		map.put("����", 150);
		map.put("����", 150);
		map.put("���", 110);
		map.put("����", 20);
		map.put("����", 990);// Ű ���� ������ ���� ���� ���� �����.
		System.out.println(map);
		// {���=110, ����=150, ����=990, ����=20, �λ�=350, �뱸=250, ��õ=300, ����=150}

		// map���� Ű�� �� ��������
		int a = map.get("����");
		System.out.println(a);

		// ó������ ������ ��ȸ�ϴ� ���
		// Map���� Iterator(�ݺ���)�� ������ ���� for���� ����� �� ����.
		// Set<String> set = map.keySet();�� Ű����
		// Set ��ü�� ��ȯ�ϹǷ� Ű�� Set��ü�� �̿��Ͽ� ó������ ������ ��ȸ�Ѵ�.

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		
		//Map�� �߿��ϴ�. ���� �ϱ� ��
		
		System.out.println("Ű�� ������ �����ϴ���? "+map.containsKey("����"));
		System.out.println("Ű�� ��Ⱑ �����ϴ���? "+map.containsKey("���"));
		System.out.println("��ü ���� "+map.size());
		map.remove("����");
		System.out.println(map);
	}
}
