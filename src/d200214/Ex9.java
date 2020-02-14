package d200214;

public class Ex9 {
	public static void print(String[] ss) {
		for (String s : ss) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	public static void sort(String[] ss) {
		int pass;
		boolean flag;
		String temp;
		// compareTo�� �̿��� �������� ����
		pass = 1;
		do {
			flag = false;
			for (int i = 0; i < ss.length - pass; i++) {
//				if(ss[i].compareTo(ss[i+1])>0) {//��������
				if (ss[i].compareTo(ss[i + 1]) < 0) {// �������� (���Ͽ� ������ ���� ��� ����)
					temp = ss[i];
					ss[i] = ss[i + 1];
					ss[i + 1] = temp;
					flag = true;
				}
			}
			pass++;
		} while (flag);
	}

	public static void main(String[] args) {
		String[] ss = { "����", "�λ�", "�뱸", "����", "����" };

		System.out.print("sort ��: ");
		print(ss);

		sort(ss);

		System.out.print("sort ��: ");
		print(ss);
	}
}