package d200130;

public class StringEx {
	public static void main(String[] args) {
		String s;
		// ���ڿ�+ ���ڵ� => ���ڿ� (����)
		s = "korea" + 9 + 3;
		System.out.println(s); // korea93

		// ���ڵ� + ���ڿ� => ���ڵ��� ��� ��� + ���ڿ�
		s = 9 + 3 + "korea";
		System.out.println(s); // 12korea

		// ���ڿ� + ���㰪 + ���� => ���ڿ� (����)
		s = "korea" + 'A' + 3;
		System.out.println(s); // koreaA3

		// ���ڿ��� �ƴ� '����'�� �������� ���� �̿��Ͽ� ����� �õ��Ѵ�.
		// ���㰪��+����+���ڿ� => ���ڵ��� ��� ��� + ���ڿ�
		s = 'A' + '0' + 3 + "korea";
		System.out.println(s);// 116korea
	}
}
