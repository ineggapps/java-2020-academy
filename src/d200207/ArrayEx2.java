package d200207;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		/*
		 5���� �̸��� ������ �Է� �޾�
		 �̸� ���� ����(����-���)�� ����ϴ� ���α׷��� �ۼ�����.
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] name=new String[5];
		int []score = new int[5];
		int tot, ave;
		
		tot=0;
		for(int i=0;i<name.length;i++) {
			System.out.print((i+1)+" ��° �̸�: ");
			name[i]= sc.next();
			System.out.print("\t����: ");
			score[i]= sc.nextInt();
			
			tot+=score[i];//�Է� ���� ������ �� ���ϱ�
		}
		//��� ���
		ave=tot/name.length;
		
		//���
		System.out.println("�̸�\t\t����\t\t����("+ ave +")");
		for(int i=0;i<name.length;i++) {
			//�̰������� ���� for���� ����� �� ����.
			//���� �ڷ����� �ٸ� ������ ���� �� Ȱ���ϰ� �ֱ� �����̴�.
			System.out.printf("%s\t\t%d\t\t%d\n",name[i],score[i],score[i]-ave);
		}
		sc.close();
	}
}
