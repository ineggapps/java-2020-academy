package d200130;

public class ChangeTest {
	public static void main(String[] args) {
		// �� ������ ���� �ٲٱ�
		int a = 10, b = 5;
		int c;
		c = a; // c�� 10�� �����Ѵ�. a�� ������ 10�� �����̴�.
		a = b;// a�� b�� ���� 5�� �����Ѵ�. b�� ������ 5�� �����̴�.
		b = c;// b�� c�� ���� 10�� �����Ѵ�. 
		//�ᱹ a�� 5�� �Ǿ��� b�� 10�� �Ǿ���. (c�� �ֹ氣�� ���� �¹ٲٱ� ���� �ӽ� ��� �����̴�.)
		System.out.println(a + ", " + b);
		
		//��Ʈ�������� ���� ��ȯ�ϴ� ���. 
		//������ ���� �� ��ȯ�� �����ϴ�
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println(a + ", " + b);
	}
}
