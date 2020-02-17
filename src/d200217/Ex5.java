package d200217;

import java.util.Calendar;

public class Ex5 {
	public static void main(String[] args) {
		// Calendar: �߻�Ŭ����(�̿ϼ� Ŭ����)�ӿ� ��������!
		// �׷��� ��ü�� ������ �� ������ ��ü�� �����ϱ� ���ؼ� Calendar.getInstance()��� �غ�� �޼��尡 ����.
//		Calendar c = new Calendar(); ������ ����
		// ��ü�� ������ �� �����Ƿ� new Calendar() ������ ������ �Ұ����ϴ�

		// ��ü ���� ���
		// ���� ��ǻ�� �ý��� �������� ��¥, �ð��� �����Ѵ�.
		// 1) Calendar cal = Calendar.getInstance();
		// 2) Calendar cal = new GregorianCalendar();
		// 3) GregorianCalendar cal = new GregorianCalendar();
		// GregorianCalendar : Calendar Ŭ������ ���� Ŭ����

		Calendar cal = Calendar.getInstance();
		// �߻�Ŭ������ ��ĳ�����Ͽ� ����� �� �ִ�. (!!)
		Father f = new Son();
		f.greet(); // ��ĳ���� ����

//		String s = String.format("%tF %tA %tT", cal, cal, cal);
		String s = String.format("%1$tF %1$tA %1$tT", cal);
		// $���ڴ� %�ٷ� �ڿ� �´ٴ� �͵� ���.
		System.out.println(s);

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;// ���� �ε��� �������� 0~11������ ��ȯ�� �ش�.
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);// �Ͽ����� 1, ������� 7�� ��ȯ�Ѵ�.
		String[] ww = { "��", "��", "ȭ", "��", "��", "��", "��" };
		System.out.printf("%d�� %d�� %d�� %s����", y, m, d, ww[w - 1]);// �Ͽ��� ���� 1�ε� �迭�� �ε����� 0�̴ϱ� w-1 �������� ����Ѵ�.

		int days = cal.getActualMaximum(Calendar.DATE);
		System.out.println("�̹� ���� " + days + "�ϱ��� �ֽ��ϴ�.");
	}
}

abstract class Father {
	int value;

	public abstract void greet();
}

class Son extends Father {
	@Override
	public void greet() {
		System.out.println("hello");
	}
}