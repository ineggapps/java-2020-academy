package d200204;

public class ForEx4 {
	public static void main(String[] args) {
//		//For�� ����� ����
//		int s = 0;
//		for (int n = 1; n <= 100; n++) {
//			s += n;
//		}
//		System.out.println("���: " + s);

//		int s = 0;
//		for (int n = 1; n <= 100; n += 2) {
//			s += n;
//		}
//		System.out.println("Ȧ���� ��: " + s);

//		int s, n;
//		for (n = 2, s = 0; n <= 100; n += 2, n += 1, n -= 1) { 
//			// �ʱ�İ� �������� ","�� �̿��Ͽ� ���� ���๮�� ����� �� ����.
//			// (�������� ����)
//			s += n;
//		}
//		System.out.println("¦���� ��: " + s);

		int s, n;
		//�ݺ����� �� �ٷ� ǥ���� ���� ����. (�������� ����)
		for (n = 1, s = 0; n <= 100; s+=n,n++);
		System.out.println("¦���� ��: " + s);
	}
}
