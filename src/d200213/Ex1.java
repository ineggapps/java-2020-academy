package d200213;

public class Ex1 {
	// return type
	public static void main(String[] args) {
		Test1 t = new Test1();
		int x;
		x = t.sub2(10);//1) �޼��� ȣ��, 4) ��ȯ�� ���� x�� �����Ѵ�.
		
//		System.out.println(t.sub1(3));������ ���� void���� �ƹ� ���� ��ȯ���� �ʱ� �����̴�.
//		x = t.sub1(10);//�̰͵� ����
		t.sub1(3);//����Ÿ���� ���� void���� ��� ������ �����ϰų� �Ű������� �ѱ� ���� ����. (�׷��ϱ� void����)
		
		x=t.sub3(10);
		if(x==1) {
			System.out.println("����");
		}
		
		t.sub3(5);//����Ÿ���� �־ �ܵ����� �ڵ� �ۼ��� �����ϴ�.
		
		
	}
}

class Test1 {
	public void sub1(int n) {
		n += 10;
		System.out.println(n);
	}

	public int sub2(int n) {
		// 2) �ڵ� ����
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		// 3) ����� ��ȯ
		return s;
	}

	public int sub3(int n) {
		if (n < 0) {
			return 0;
		}
		System.out.println(n);
		return 1;
	}
}
