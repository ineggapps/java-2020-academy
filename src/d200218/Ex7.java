package d200218;

import java.text.ChoiceFormat;

public class Ex7 {
	public static void main(String[] args) {
		//#, < �� ������ "limit#value" "limit<value" ���·� �ۼ��Ѵ�.
		//<�� ��찪�� �������� �ʰ�, #�� ��찪�� �����Ѵ�.
		String p = "0#F|60#D|70#C|80<B|90#A";
		int []ss= {20,99,95,88,70,52,60,100,80,50};
		ChoiceFormat f = new ChoiceFormat(p);
		
		for(int s:ss) {
			System.out.println(s+"�� ����� " + f.format(s)+"����Դϴ�.");
		}
	}
}
