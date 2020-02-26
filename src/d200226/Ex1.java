package d200226;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("������", 80);
		map.put("����", 90);
		map.put("������", 100);
		map.put("������", 60);
		map.put("ũũũ", 80);

		System.out.println(map);

		// Ű�� Set���� ��������
		System.out.println("Ű�� SET���� ��������");
		Set<String> set = map.keySet();
		System.out.println(set);

		// map�� ���� list�� ��������
		List<Integer> list = new LinkedList<>(map.values());
		System.out.println(list);
		list.clear();
		list.addAll(map.values());
		System.out.println(list);
		
		System.out.println("map ��ü-1");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + score);
		}
		System.out.println();

		// - entry: key�� value�� �����ֱ� ���� ���
		// - Map.Entry: �������̽� (Ű�� ���� �ϳ��� ���� ���� ����ϴ� ���� Entry�̴�)
		// Ű�� ���� Set ���·� �����ϱ� ���� ���
		// ��, Map�� Entry(Ű�� ���� �� ��)�̴�.
		System.out.println("map ��ü-2");
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey() + "->" + e.getValue());
		}
		System.out.println();

		// ���� for��
		System.out.println("map ��ü-3");
		for (String s : map.keySet()) {
			int score = map.get(s);// map���� key�� �ش��ϴ� �� ��������
			System.out.println(s + ": " + score);
		}
		System.out.println();
		
		//���� �÷�������
		System.out.println("���� �÷������� ��������");
		Collection<Integer> col = map.values();
		Iterator<Integer> it3 = col.iterator();
		while(it3.hasNext()) {
			int a = it3.next();
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("�ְ� ����: "+ Collections.max(col));
		System.out.println("���� ����: "+ Collections.min(col));
	}
}
