package d200217;

import java.sql.Date;

public class Ex13 {
	public static void main(String[] args) {
		//�����ڿ��� �Ű������� ���� ������ �� �ִ� �����ڰ� ����.
		Date date = new Date(new java.util.Date().getTime());
		System.out.println(date.toString());
		//java.util.Date()�� �޸� java.sql.Date()�� ��쿡�� �̱������� ��¥�� ��µ��� �ʾҴ�.
		//�� Ŭ������ DB���� ��¥�� ������ �� ����ϴ� Ŭ�����̹Ƿ� �̿��� �뵵�δ� �� ������� �ʴ´�.
	}
}
