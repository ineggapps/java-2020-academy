package d200221;

public class Ex13 {
	//unchecked Exception ���õ� ����
	public static void main(String[] args) {
		User13 uu = new User13();
		uu.setValue(-1);// setValue �޼��带 ȣ���� �� RuntimeException ���ܰ� �߻��Ѵ�.
		//������ ����ó���� ���� �ʾƼ� ���α׷��� ������ ����ȴ�.
		int n = uu.getValue();
		System.out.println(n);
		System.out.println("end....");
	}
}

class User13{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value<0) {
			//unchecked Exception ������ RuntimeException�� �޼��忡 throws�� �ݵ�� ����� �ʿ䰡 ����.
			//���� �ݵ�� �� �޼��带 �θ� �޼��忡���� try-catch ������ ����� �ʿ䰡 ����.
			throw new RuntimeException("0 �̻� �����մϴ�. ");
		}
		this.value = value;
	}
	
}
