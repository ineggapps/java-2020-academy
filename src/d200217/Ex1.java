package d200217;

public class Ex1 {
	public static void main(String[] args) {
		int a = 10, b;
		Integer ob;
		String s, s1, s2;
		double d;

		// ��ü�� �⺻�ڷ����� �⺻������ ����ȯ�� �Ұ����ϴ�.
		// ���ϰ��谡 �ƴ� ��� ��ü������ ����ȯ�� �Ұ����ϴ�.

		// JDK 5.0���� Autoboxing, Autounboxing�� �����Ѵ�.

		ob = a;
		// �⺻ �ڷ��� int�� Integer�� ���� �ڵ����� ��ȯ�Ǿ���.
		// �����δ� ob = new Integer(a);�� ��ɱ����� �������� �� ��ȯ�� ���̴�.
		// �̸� Auto boxing�̶�� �Ѵ�.

		b = ob;
		// Integer ��ü�� ���� �ڵ����� �⺻�ڷ����� int������ ��ȯ�Ǿ���.
		// �����δ� b = ob.intValue();�� ��ɱ����� �������� �� ��ȯ�� ���̴�.
		// �̸� Auto unboxing�̶�� �Ѵ�.

		System.out.println(a + ":" + ob + ":" + b);

		s1 = "123";
		s2 = "456";
		// a=s1+s2; //�翬�� ������ ������ �߻��Ѵ�.

		// �������ӿ��� �ұ��ϰ� Integer�� static method�� ����ϸ� int������ ��ȯ�Ͽ� ������ �����ϴ�.
		a = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(a);

//		a = Integer.parseInt("123.5");// ��Ÿ�� ���� java.lang.NumberFormatException
		// �Ҽ����� �ִ� ���ڴ� ������ ��ȯ�� �Ұ����ϹǷ� ������ �߻���Ų��.

//		a = Integer.parseInt("1,234");//��Ÿ�� ���� java.lang.NumberFormatException
		// ���ڷ� ��ȯ�� �� ���� ��� ���ڿ��� ���ԵǾ� �ִ� ��쿡�� ���� ���� ������ �߻��Ѵ�.

		a = 10;
		s = 'A' + a + "Korea";
		System.out.println(s);// 75Korea

		// IntegerŬ������ ���ڿ��� �ٲٴ� �޼��尡 �����Ѵ�.
		s = 'A' + Integer.toString(a) + "Korea";
		System.out.println(s);// A10Korea

		a = Integer.parseInt("101");
		System.out.println(a);// 101

		a = Integer.parseInt("101", 2);// 2������ 101...
		System.out.println(a);// 5

		a = Integer.parseInt("A1", 16);// 16������ A1
		System.out.println(a);// 10������ ��ȯ�� �ᱣ���� 161�� ��ȯ�ȴ�.

		a = 123;
		s = Integer.toBinaryString(a);
		System.out.println(s);// 2������ ��ȯ�� 1111011

		s = Integer.toHexString(a);
		System.out.println(s);// 16������ ��ȯ�� 7b

	}
}
