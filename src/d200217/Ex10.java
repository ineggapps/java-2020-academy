package d200217;

import java.util.Calendar;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.print("��¥ [yyyy-mm-dd] ? ");
//		str = sc.next();
		str="2020-02-19";

		// ����ó�� ��� (���� ����ó�� ���� ������ �ʾ���)
		if (str.length() != 10 || str.split("-").length != 3) {
			System.out.println("��¥ �Է� ���� ����");
			sc.close();
			return;
		}

		String[] ss = str.split("-");
		int y = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		int d = Integer.parseInt(ss[2]);
		int w,n;
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m - 1, d);
		System.out.printf("��¥: %tF\n", cal);

		Calendar sday = (Calendar) cal.clone();// ��ü�� �����Ѵ�.
		//�����Ͽ����Ƿ� ���밪�� ������ ���� �ٸ� ��ü��� ���ƾ� �Ѵ�. (�ֳ��ϸ� �ּڰ��� �ٸ� ���� �� �ٽ� ������ �� ���̱� ������)
		//Calendar sday = Calendar.getInstance();
		//sday.set(y,m-1,d); �� 2���� ���� ������ �Ͱ� ����� ȿ��.
		// 2020�� 2�� 20���� �Է��ϸ� sday�� 2�� 16���� ����Ű�� eday�� 2�� 22���� �����Ѿ� �Ѵ�.
		w=cal.get(Calendar.DAY_OF_WEEK);
		n=w-1;
		sday.add(Calendar.DATE, -n);
		System.out.printf("�� ����: %tF\n", sday);

		Calendar eday = (Calendar) cal.clone();// ��ü�� �����Ѵ�.
		eday.add(Calendar.DATE,  7-w);//or -n+6
		System.out.printf("�� ������: %tF\n", eday);

		sc.close();
	}
}
