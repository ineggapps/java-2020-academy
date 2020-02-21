package d200221;

public class Ex12 {
	public static void main(String[] args) {
		User12 ob = new User12();
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		System.out.println("------------------------");
	}
}

//�߸� �ۼ��� ���
class User12 {
	private int value;

	public void setValue(int value) {
		try {
			if (value < 0) {
				throw new Exception("0���� ���ݾ�!");
			}
			this.value = value;
		}
		catch(Exception e) {// throw new Exception("~") �� ���� catch��.
			//�޼��带 ȣ���� �������� ���ܰ� �ִ��� ���� ���Ѵ�. (ȣ���� �������� ���ܸ� ���� �� ���ٴ� �̾߱���)
			//�߸� �ۼ��� �ڵ�
			//���ܸ� ������ �ñ⿡ �߻���Ű�� �͵� �߿�������, �� ���ܸ� ��� ó���ؾ� �ϴ��� ���ϴ� �� ���� �ſ� �߿��ϴ�. 
			System.out.println(e.toString());
		}
	}

	public int getValue() {
		return value;
	}
}