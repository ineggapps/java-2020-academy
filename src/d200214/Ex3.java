package d200214;

public class Ex3 {
	public static void main(String[] args) {
		String s1 = "seoul";
		String s2 = s1;

		System.out.println(s1 == s2);// true
		s1 += "korea";// String������ +�� ���ڿ��� �����ϴ� ���̴�.
		// ������ String�� �Һ��� ��Ģ(�б� ����)�̹Ƿ� ���ڿ��� �����Ͽ� ���ο� �����ҿ� �����ϰ�
		// ������ ����� ���� �ּڰ��� s1�� �����ϰ� �ȴ�.
		System.out.println(s1 == s2);// false
		System.out.println(s1);
		System.out.println(s2);

		Ex3 ob = new Ex3();
//		String s= ob;//String�� Ex3�� �ڷ����� ���� �ٸ���.
		String s = "seoul" + ob;//"���ڿ�"+"��Ű����.Ŭ������@�ؽ�16����"
		System.out.println(s);
	}
}
