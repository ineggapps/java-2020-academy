package d200217;

import java.util.Calendar;

public class Ex6 {
	public static void main(String[] args) {
		//OO�̰� 2020�� 2�� 10�� ����ģ���� ó�� ������. 100�� �Ĵ� �� �� ��ĥ�ΰ�?
		Calendar cal = Calendar.getInstance();
		//2020�� 2�� 10�Ϸ� �����ϱ�
		cal.set(2020, 2-1, 20);//��¥�� ���Ƿ� �����ؾ� �Ѵ�. ��, ���� [��-1]�� ���Ѽ� �Է��ؾ� �Ѵ�.
		//���� ��¥���� 100���� ���ϴ� ���
		cal.add(Calendar.DATE, 100);
		//���� �ᱣ�� ��ȸ
		System.out.printf("%tF %tA %tT",cal,cal,cal);
	}
}
