package d200214;

public class Ex5 {
	public static void main(String[] args) {
		String s = "    ��      ��    ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":");
		System.out.println(":" + s.replaceAll(" ", "") + ":");

		int a = 1234567;
		s = String.format("%,d", a);
		System.out.println(s);
		s = String.format("%1$,d %1$d %2$d", a, 20);
		System.out.println(s);

		s = "KOREA";
		System.out.println(s + "�� ����Ʈ�� ��ġ��");
		byte[] bb = s.getBytes();// ���ڿ��� ASCII �ڵ尪�� byte�迭�� ��ȯ�Ѵ�.
		for (byte b : bb) {
			System.out.print(b + "\t");
		}
		System.out.println();
		
		String s1 = new String(bb);
		System.out.println(s1);

		s = "���ѹα�";
		System.out.println(s);
		bb = s.getBytes();
		for (byte b : bb) {
			System.out.print(b+"\t");
		}
		System.out.println();
		
		String s2;
//		s2=123;//������ ���� 
		s2=""+123;//����(�������� ����)
		
		s2= Integer.toString(999);//������ ���ڿ���
		System.out.println(s2);
		
		s2="100";
		int n = Integer.parseInt(s2)+90;
		System.out.println(n+1);
	}
}
