package d200130;

public class OperEx1 {
	public static void main(String[] args) {
		// ����������
		int a, b;

		/*
		a = a + 1;
		b = a;
		*/
		a = 10;
		b = ++a;//++����: 1 ���� �� ����
		System.out.println(a+","+b);

		/*
		b = a;
		a = a + 1;
		 */
		a = 10;
		b = a++;//����--: ���� �� 1 ����
		System.out.println(a+","+b);

		/*
		a = a - 1;
		b = a;
		 */
		a = 10;
		b = --a;//--����: 1 ���� �� ����
		System.out.println(a+","+b);
		
		/*
		b = a;
		a = a - 1;
		 */
		a = 10;
		b = a--;//����--: ���� �� 1 ����
		System.out.println(a+","+b);
		
		
		/*
		�ܵ����� ���� ������ �ϴ� ��쿡�� ++/--��ȣ�� ���̳� �� ����ʿ� ���̰� �ᱣ���� ����.
		*/
		
		a=10;
		++a;
		System.out.println(a);
		
		a=10;
		a++;
		System.out.println(a);
	}
}
