package d200130;

public class OperEx5 {
	public static void main(String[] args) {
		//���� ����
		int a, b;
		boolean c;
		a = 10;
		b = 5;
		// c = a&& b; �����Ͽ��� &&(����)�� �ǿ����ڰ� boolean type�̾�� �Ѵ�.
		c = a > b && false;// => true && false
		System.out.println(c);// false
		c = a > b && true;// => true && true
		System.out.println(c);// true

	}
}
