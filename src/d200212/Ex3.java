package d200212;

public class Ex3 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
		Test3 t = new Test3();
		t.sub(arr);//�Ű������� �迭�̸� ���μ��� �迭�̾�� �Ѵ�.
		//�迭�� �����ڷ����̹Ƿ� �Ķ���Ϳ��� �迭��ü�� �ּڰ��� �Ѿ��.
		System.out.println(arr[2]);//100�� ����Ѵ�.
		//�ڹ��� �⺻���� �Ķ���� ���� ����� call by value�̴�.
		//�⺻�ڷ����� �� ��ü�� �Ѱ��ֹǷ� ���μ����� ������ ���밪�� �������� �ʴ´�.
		int n = 0;
		t.sub2(n);
		System.out.println(n);// 0�ᱣ���� ��µȴ�
		
		int[] aa = {1,3,5,7,9};
		t.sub3(aa);
		System.out.println(aa[2]);
		
		/*
		 Call by value vs reference ����
		 
		 Call by value:
		 ���ĸŰ�����(�޼�����)�� �ǸŰ�����(�ѱ���� �ϴ� ���� ��)�� �������� �������� �ʴ´�.
		 Call by reference:
		 ���� �Ű������� �� �Ű� ������ �������� ������ �� ����.
		 * */
	}
}

class Test3 {
	public void sub(int[] a) {
		if (a == null || a.length == 0) {
			return;
		}
		a[2]=100;
	}
	
	public void sub2(int n) {
		n=100;
	}
	
	public void sub3(int[] a) {
		a = new int[5];
		a[2]=5000;
	}
}
