package d200226;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
	public static void main(String[] args) {
		// Queue ���� (LinkedList) FIFO ����
		Queue<String> q = new LinkedList<>();
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
			System.out.print(s+" ");
		}
		System.out.println();

	}
}
