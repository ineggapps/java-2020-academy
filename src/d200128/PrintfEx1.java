package d200128;

public class PrintfEx1 {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 25;
		c = a + b;

		System.out.println("��:" + c);
		System.out.println(a + "+" + b + "=" + c);
		//������ ������ ������ Ʋ�� ���߾� ����ϰ� ���ִ�  printf �޼���
		System.out.printf("%d + %d = %d\n",a,b,c);
		System.out.format("%d + %d = %d\n",a,b,c);
		System.out.println("========================");
	}

}
