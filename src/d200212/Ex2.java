package d200212;

public class Ex2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		int score = 80;
		String s ;
		s = t.hak(score);
		System.out.println(s);
		
		short n=10;
		int a= t.odd(n);//������ ���μ��� �޴� ���μ����� �ڷ����� �۰ų� ���ƾ� �Ѵ�.
		System.out.println("a:"+a);
		
		double d = t.odd(n); //��ȯ�Ǵ� �ڷ������� �޴� �ڷ����� ũ�ų� ������ �ȴ�.
		//���⼭ t.odd(n)�� int������ ��ȯ�ϴµ� �޴� �ڷ����� double���̴�.
		//���� double�� ������ int�� �ڷ����� ���� �� �ִ�.
		System.out.println("d:"+d);
	}
}

class Test2 {
	public String hak(int s) {
		String h = null;
		//h�� null�� �ʱ�ȭ��Ű�� �ʰ� �ٷ� return�� �ϰ� �Ǹ� �ʱ�ȭ���� �ʾұ� ������ ������ ������ �߻��Ѵ�.
		//(�� �Ʒ��� switch������ ���� ���)
		switch (s / 10) {
		case 10:
		case 9:
			h = "��";
			break;
		case 8:
			h = "��";
			break;
		case 7:
			h = "��";
			break;
		case 6:
			h = "��";
			break;
		default:
			h = "��";
			break;
		}
		return h;//��ȯ�Ǵ� ���� ������ 1���̴�.
	}
	
	public int odd(int n) {
		int s=0;
		for(int i=1;i<=n;i+=2) {
			s+=i;
		}
		return s;
	}
}
