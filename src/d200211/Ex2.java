package d200211;

public class Ex2 {
	public static void main(String[] args) {
		Bank b1; // �������� ����
		b1 = new Bank();// �� ������ �������� Null Pointer (������ ����)�� �߻��Ѵ�.
		// �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� ������ �� �ִ�.
		b1.name = "ȫ�浿";// Default�����������̰� ���� ��Ű�� �ȿ� �����Ƿ� ������ �� ����.
//		b1.money=1000;private�� �ܺο��� ������ �� ����.
		b1.saving(1000);

		Bank b2 = new Bank();// �������� ����� ���ÿ� �޸� �Ҵ��ϴ� ���� �����ϴ�.
		b2.name = "�̼���";
		b2.saving(500);

		System.out.println(b1.name + ": " + b1.getMoney());
		System.out.println(b2.name + ": " + b2.getMoney());
	}
}

class Bank {
	// �ν��Ͻ� ������ �ν��Ͻ� �޼���� ��ü�� �����Ǿ�� ȣ���� �� �ִ�.
	// �ν��Ͻ� ����, ���� ���� �� �ʱ�ȭ ����
	// private: Ŭ���� �������� ����� ������ ����. �ܺ� ���� �Ұ�.
	private int money;
	// �ν��Ͻ� ������ �ڵ����� �����Ͽ� 
//	money = 100;//�޼��� �ۿ����� ���๮�� �� �� ����. 
	
	// �ν��Ͻ� ����.
	// ���������ڰ� ����Ʈ(������ ���)�� ��� ������ ��Ű�������� ������ �����ϴ�.
	String name;

	// �ν��Ͻ� �޼���
	public int getMoney() {
		return money;
	}

	// �ν��Ͻ� �޼���
	public int draw(int m) {// m: �Ű�����
		// ������� ���� �ں����� ũ��?
		// ���⿡ ���õ� �޼���
		if (m > money) {
			return 0;
		}
		int s;// ���� ����
		s = money - m;
		money = s;
		return m;
	}

	// �ν��Ͻ� �޼���
	public void saving(int m) {
		// �Ա�
		money += m;
	}
}