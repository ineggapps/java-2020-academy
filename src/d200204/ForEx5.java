package d200204;

public class ForEx5 {
	public static void main(String[] args) {
//		int n;
//		for (n = 10; n <= 1; n++) {// ������ �������� ������ �� �� ���� �������� �ʴ´�.
//			System.out.println("��: " + n);
//		}
//		System.out.println("��: " + n);

		int n;
		for (n = 10; n >= 1; n--) {
			System.out.println("��: " + n);//10 9 ... 2 1
		}
		//�����Ŀ��� n--�� ����ǰ� ���ǽĿ��� false�� �Ǿ� �ݺ����� �����Ѵ�.
		//�ݺ����� ����� ���¿��� n�� ���� 0�̴�.
		System.out.println("��: " + n);//0
	}
}
