package d200218;

import java.text.NumberFormat;

public class Ex2 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();

		String s1 = "1000";
		String s2 = "1000.912";
		String s3 = "1,000";

		try {
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);

			//NumberŬ������ �̿��Ͽ� �ٷ� �ܼ�â�� ����� �� ����
			System.out.println(n1 + ":" + n2 + ":" + n3);

			//�Ҽ��� ����
			nf.setParseIntegerOnly(true);//�Ҽ��� ����
			n2 = nf.parse(s2);
			System.out.println(n2);
			
			//����� ����ϱ⵵ ����
			double d= 0.125;
			NumberFormat nf2 = NumberFormat.getPercentInstance();
			String s = nf2.format(d);
			System.out.println(s); //12% ��µ�
			
			
			
		} catch (Exception e) {
			System.out.println("���� �߻�" + e.getMessage());
		}
	}
}
