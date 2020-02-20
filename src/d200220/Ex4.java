package d200220;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		SortInt s = new SelectionSort();
		SortInt s2 = new BubbleSort();
		System.out.println("���� ����");
		s.sort(new int[] { 2, 4, 99, 3, 5 });
		System.out.println("���� ����");
		s2.sort(new int[] { 2, 4, 99, 3, 5 });
	}
}

abstract class SortInt {
	private int[] value;

	protected abstract void sorting();// �߻� �޼���

	public void sort(int[] value) {
		this.value = value;
		sorting();// �� ���� ������ ���ǵ��� ���� �߻�޼����ӿ��� �ұ��ϰ� ȣ���� �� �ִٴ�!
		//������ abstractŬ������ ��ü������ ��������
		//��ü�� ������ �� �ִ� ��ӹ޴�(extended�� Ŭ����) Ŭ�������� �̹� �����Ǹ� ���� �״ϱ�!
		//Ȯ���� Ŭ������ �޼���, �� ����� �޼����� sorting()�� ȣ���ϴ� �Ŵϱ� ����� ���ڱ���!
	}

	protected int length() {
		return value == null ? -1 : value.length;
	}

	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}

	protected void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}

	public void print() {
		if (value == null) {
			return;
		}
		System.out.println(Arrays.toString(value));
	}
}

class SortIntReal extends SortInt {

	@Override
	protected void sorting() {

	}

}

//�߻�ȭ �۾� (selection sort)
//�ʵ�
//		value[]: int
//�޼���
//		����
//		��
//		�±�ȯ
//		������ ���� Ȯ��

// � ���Ĺ��̵� ����, ��, �±�ȯ, ������ ���̸� Ȯ���ϴ� ������ ������ ����.
// �ٸ� ������ ���� ������ �ٸ� ���̴�. (����)

//�߻� Ŭ������ ��� ���� Ŭ������ �߻� Ŭ������ �ƴϸ� 
//�ݵ�� ���� �߻� �޼��带 �������̵��Ͽ� ������ �����ؾ� �Ѵ�.
class SelectionSort extends SortInt {
	@Override
	protected void sorting() {
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if (compare(i, j) > 0) {
					swap(i, j);
				}
			}
			print();
		}
	}
}

class BubbleSort extends SortInt {
	@Override
	protected void sorting() {
		int pass = 1;
		boolean flag;
		do {
			flag = false;
			for (int i = 0; i < length() - pass; i++) {
				if (compare(i, i + 1) > 0) {
					swap(i, i + 1);
					flag = true;
				}
			}
			print();
		} while (flag);
	}
}