package d200213;

public class Ex3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print(5);
		int s = t.sum(5);
		System.out.println(s);
		System.out.println("t.pow()");
		System.out.println(t.pow(2, 0));
	}
}

class Test3 {
	public void print(int n) {
		// stack�� Ȱ��
		/*
		 * �Ʒ��� ������ ���� ������ ��� �޼�����...
		 * 5. print(1) ȣ�� => 6. 1 ���
		 * 4. print(2) ȣ�� => 7. 2 ���
		 * 3. print(3) ȣ�� => 8. 3 ���
		 * 2. print(4) ȣ�� => 9. 4 ���
		 * 1. print(5) ȣ�� => 10. 5 ���
		 * 
		 * ��, ���Ӿ��� ȣ��Ǹ� java.lang.StackOverflowError�� �߻��Ѵ�.
		 */
		if (n > 1) {
			print(n - 1);// ���ȣ��
		}
		System.out.println(n);
	}

	public int sum(int n) {
		/*
		 * ���ȣ���� ��
		 *												������ ���� ����
		 * sum(5) ȣ�� �� => 5+sum(4) ȣ��
		 * sum(4) ȣ�� �� => 5+4+sum(3) ȣ��
		 * sum(3) ȣ�� �� => 5+4+3+sum(2) ȣ��
		 * sum(2) ȣ�� �� => 5+4+3+2+sum(1) ȣ��
		 * sum(1) ȣ�� �� => 5+4+3+2+1 �ᱣ�� ��ȯ
		 * */
		return n > 1 ? n + sum(n - 1) : n;
	}

	// Quiz. ��, y�� 0�̻�
	// x�� y�� ����ϱ�
	public int pow(int x, int y) {
		// ex: 2�� 3���̸� pow(2,3)=8�� ��ȯ�Ǿ�� �Ѵ�.
		return y > 0 ? x * pow(x, y - 1) : 1;//��� ���� 0���� �����ϸ� ������ 0�� �� 1�� ��ȯ���־�� �Ѵٴ� ���� �����ؾ� �Ѵ�.
	}
	
	public int factorial(int n) {
		return n > 0 ? n * factorial(n - 1) : 1;
	}
}