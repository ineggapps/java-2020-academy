package d200221;

public class Ex11 {
	public static void main(String[] args) throws Exception{//main�� throws�� �� ��� JVM���� ������ �߻��� �� �ִٰ� ���ѱ��. (�����)
		User11 ob = new User11();
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		System.out.println("------------------------");
	}
}

//�߸� �ۼ��� ���
class User11 {
	private int value;

	public void setValue(int value) throws Exception {// �޼��带 ȣ���ϴ� ������ ���ܸ� catch�ϵ��� ����
		if (value < 0) {
			throw new Exception("0���� ���ݾ�!");// ������ checked ���ܸ� �߻�(Exception ���� �߻�)
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}