package d200206;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int []a;�� ������ ������ �ƴϴ�.
		//a�� ���ӵ� �޸� ������ ����� ���� �����ϱ� ���� ��(������)�� ������.
		
		int[] a;// �迭 ���� ��� (������ ������ �� �ִ� ������ �迭)
		a = new int[5];// �޸� �Ҵ�, ������ ���� 5���� ������ ���� �����ϴ�.
		// �޸𸮸� �Ҵ��ϸ鼭 5���� ���� �迭 ��Ҵ� 0���� �ʱ�ȭ��.

//		int n;
////		n=0;
//		System.out.println(n);//�Ϲ� �迭�� ���� �ϰ� �ʱ�ȭ���� ������ ������ ������ �߻��Ѵ�.

		// �ڹ迭�� �޸𸮸� �Ҵ��ϸ� ���� �ڵ����� �ʱ�ȭ���ֹǷ� ������ �ʱ�ȭ ������ ���� �ʾƵ� �ȴ�.
		// �迭���� 0��° ��ġ�� ���� ����Ѵ�.
		System.out.println(a[0]);// 0
		// �迭�� ÷��(index)�� 0���� ����-1���� ����� �����ϴ�.
		// ex: �迭�� ���̰� 2�̸�? ÷�ڴ� 0�� �����ϸ� 2-1=1���� ����� �����ϴ�.

		// �迭 ��Ҹ� ����ϱ�
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		/*
		 ������ ����
		 	- ������ Ʋ���� ������ �� ������ �߻��Ѵ�
		 ��Ÿ�� ����
		 	- ���α׷��� �����ϴٰ� ���߿� ������ �߻��� ���
		 	- ��Ÿ�� ������ �߻��ϸ� �� ������ �������� ������� ���� ä ����ȴ�.
		 * */
//		a[5] = 60; //������ �迭�� ũ�⸦ �ʰ��Ͽ����Ƿ� ��Ÿ�� ������ �߻��Ѵ�.
		//��Ÿ�ӿ���(java.lang.ArrayIndexOutOfBoundsException), (�����Ͽ��� �ƴ�!!!!)
		System.out.println(a[0]);
		//new int[5] => a[0]~a[4]������ ����� �����ϴ�.
	}
}