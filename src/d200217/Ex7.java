package d200217;

import java.util.Calendar;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y, m, w, ends;
		
		do {
			System.out.print("���� ? ");
			y=sc.nextInt();
		}while(y<1900);

		do {
			System.out.print("�� ? ");
			m=sc.nextInt();
		}while(m<1||m>12);
				
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);//��¥�� 1���� �������������� ���ؾ� �ϴϱ� ��-1, 1�Ϸ� �����Ͽ���.
		w=cal.get(Calendar.DAY_OF_WEEK);//1�� �Ͽ��� 7�� �����
		
		ends= cal.getActualMaximum(Calendar.DATE);
		System.out.printf("\t%d�� %d��%n", y,m);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("=====================");
		
		//�޷��� �׸��� ���ؼ���
		//1) 1���� ������������?
		//2) ������ ��ĥ����?
		//���� �� ������ �ʿ��ϴ�.
		
		//1���� �Ͽ��Ϻ��� �����϶�� ���� ����. �׷��Ƿ� �����ϴ� ���� �������� �������� ������ �Ѵ�.
		for(int i=1;i<w;i++) {
			System.out.print(" *\t");
		}
		
		//1�Ͽ��� ���ϱ��� ���������� ������ ����ֱ�.
		//������ ���� ���������� ī��Ʈ�ϱ� ���ؼ��� w����(����)�� �̿��Ѵ�.
		//2020�� 2���� ������̹Ƿ� w������ 7�� �� ���̴�.
		//���������� ���ϱ��� ī��Ʈ�ϸ鼭 7�� ���� �������� 1�� �� ������ �ٹٲ��� �Ѵ�.
		//�� ���⼭�� w++�� ���� �����Ͽ����Ƿ� �������� 0�� �ƴ� 1�� �� ���� ������� �ǹ��Ѵ�.
		for(int i=1;i<=ends;i++) {
			System.out.printf("%2d\t",i);
			w++;
			if(w%7==1) {
				System.out.println();
			}
		}
		System.out.println("=====================");
		sc.close();
	}
}
