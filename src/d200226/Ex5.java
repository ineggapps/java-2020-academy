package d200226;

import java.util.PriorityQueue;

public class Ex5 {
	public static void main(String[] args) {
		//�켱���� ť 
		//Comparable �������̽��� ������ ��츸 �����ϴ�.
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("�ڹ�");// ť�� �������� ��� ����
		q.offer("����Ŭ");// ť�� �������� ��� ����
		q.offer("����");// ť�� �������� ��� ����
		q.offer("������");// ť�� �������� ��� ����
		q.offer("�ȵ���̵�");// ť�� �������� ��� ����

		//peek(): head ��ȯ
		//poll(): head ��ȯ �� ��� ����.
		
		//�ݺ����� ������ �� queue�� �����Ͱ� �� ���� ���� ���� �ִٴ� ����� ���� �����϶�!
		while (q.peek() != null) {
			String s = q.poll();
			//��µ� ���� �켱���� ť�̹Ƿ� ���ĵǾ� ���´�.
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
