package d200221;

public class Ex10 {
	public static void main(String[] args) {
		User10 ob = new User10();
		try {
			ob.setValue(-3);
			int n = ob.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("------------------------");
	}
}

//�߸� �ۼ��� ���
class User10 {
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