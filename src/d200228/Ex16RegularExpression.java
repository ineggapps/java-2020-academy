package d200228;

import java.util.regex.Pattern;

public class Ex16RegularExpression {
	public static void main(String[] args) {
		String s, p;
//		p="\\d{1,3}";//���ڰ�(\\d) ù ° �ڸ����� �� ° �ڸ����� �־�� ��({1,3})
//		s="100";
		
//		 �弳 ���͸�
//		p=".*(?i)(ac|�ٺ�).*"; ���⼭ (?i)�� ��ҹ��ڸ� �������� ����.
//		s="�츮 �ٺ� �� ac ����";//"�ٺ�" "ac" �Ǵ� "AC" �弳 ���͸�
		
//		�ѱ۸� 2~10����
//		p = "[��-�R]{2,10}";
//		s = "�ѱ۸��ۼ��̰���";
		
//		�ѱ� 1�� �̻�
//		p = "^[��-�R]+$";//�ѱ� 1�� �̻�
//		s="ũũũ";

		//		//�弳 ���͸� advanced (�߰��� ���ڸ� �Է��߾ �����ϱ�)
//		s="�츮 ��1�� �� a1c ����";
//		s = s.replaceAll("\\d", "");
//		p = ".*(?i)(ac|�ٺ�).*";
//		System.out.println(s);
		
		p="c.*t";//c�� �����ϰ� c������ .* (��� ���ڿ��� 0�� �̻�) t�� ������ �Ѵ�.
//		s="cbasbt";//true
//		p="c*t";//c�� 0�� �̻����
		
		System.out.println(s.replaceAll(p, ""));
		if (Pattern.matches(p, s)) {
			System.out.println("����");
		} else {
			System.out.println("�Ұ���");
			;
		}

	}
}
