package d200217;

import java.text.SimpleDateFormat;
import java.util.Date;

//���߿� ����ó���� �߰��ϸ� �� ���� Ŭ������ ��ȯ�� �� ����.
public class DateUtil {
	/**
	 * String�� ��¥�� Date������ ��ȯ
	 * @param strDate ��ȯ�� ��¥
	 * @return ��ȯ�� Date��
	 */
	public Date toDate(String strDate) {
		Date date = null;
		try {
			strDate.replaceAll("(\\-|\\.|/)", "");
			if(strDate.length()!=8) {
				//TODO: ���� ������.
				return null;
			}
			//��� ��¥������ ��ȯ�Ǿ����Ƿ� ������ ������ ���� �Է��Ѵ� yyyyMMdd
			SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
			date = f.parse(strDate);
		} catch (Exception e) {
			// TODO: ���� ������
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		return date;
	}
	
	public String toString(Date date) {
		String s = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		s = f.format(date);
		return s;
	}
}