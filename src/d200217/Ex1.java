package d200217;

public class Ex1 {
	public static void main(String[] args) {
		int a=10,b;
		Integer ob;
		String str;
		double d;
		
		
		//��ü�� �⺻�ڷ����� �⺻������ ����ȯ�� �Ұ����ϴ�.
		//���ϰ��谡 �ƴ� ��� ��ü������ ����ȯ�� �Ұ����ϴ�.
		
		// JDK 5.0���� Autoboxing, Autounboxing�� �����Ѵ�.
		
		ob=a;
		//�⺻ �ڷ��� int�� Integer�� ���� �ڵ����� ��ȯ�Ǿ���.
		//�����δ� ob = new Integer(a);�� ��ɱ����� �������� �� ��ȯ�� ���̴�.
		//�̸� Auto boxing�̶�� �Ѵ�.
		
		b=ob;
		//Integer ��ü�� ���� �ڵ����� �⺻�ڷ����� int������ ��ȯ�Ǿ���.
		//�����δ� b = ob.intValue();�� ��ɱ����� �������� �� ��ȯ�� ���̴�.
		//�̸� Auto unboxing�̶�� �Ѵ�.
	}
}
