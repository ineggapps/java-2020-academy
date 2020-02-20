package d200220;

public class Ex10 {
	public static void main(String[] args) {
		Demo10 d = new Test10();
		d.write();
		System.out.println(d.max(10, 3));
		System.out.println(Demo10.sum(100));
	}
}

//JDK 8 �̻󿡼��� �����Ѵ�.
//static �޼���, default �޼��� ��� ����
interface Demo10 {
	public void write();

	public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}

	// default�޼���
	// default�޼��忡���� ���� ����. �� default �޼��尡 �ƴϸ� ���� �Ұ����ϴ�.
	public default int max(int m, int n) {
		return m > n ? m : n;
	}
}

interface Demo102{
	public default int max(int m, int n) {
		return m;
	}
}
//������: interface�� ���߻���� �����ϰ� �߻�Ŭ������ Ŭ������ ���ϱ� ���� ����� �Ұ����ϴ�!


class Test10 implements Demo10, Demo102 {

	//����~ �������̵��� �� �� �޼��尡 ��ġ�� Ŭ������.super�� ���±���!
	//�̰��� �ٷ� ���߻��?
	@Override
	public int max(int m, int n) {
		return Demo10.super.max(m, n);
	}

	@Override
	public void write() {
		System.out.println("������");
	}

}