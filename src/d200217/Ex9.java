package d200217;

import java.util.Calendar;

public class Ex9 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		//���� ����
		cal.set(1999,10-1,9);
		
		//�� ���� ����ϱ�
		int age = (now.get(Calendar.YEAR)-cal.get(Calendar.YEAR));
		if(cal.get(Calendar.MONTH)>now.get(Calendar.MONTH) || 
				cal.get(Calendar.DATE) > now.get(Calendar.DATE)) {
			age--;
		}
		System.out.println(age);
		//�Ǵ�...
		long days = (now.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println("����:" + days/30/12);
	}
}
