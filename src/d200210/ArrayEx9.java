package d200210;

import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 5���� �̸��� ����, ����, ���� ������ �Է� �޾� ����, ��� �� ������ ó���ϴ� ���� ó�� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int num = 5;
		String[] name = new String[num];
		String[] subjects = new String[] {"����","����","����"};
		int[][] scores = new int[num][5];//5���� ����, ����, ���� ������ ����, ���0 �Է�
		int[] rank = new int[num];//��ŷ
		//�Է�
		for(int i=0;i<num;i++) {
			System.out.printf("%d��° �̸� > ",i+1);
			name[i] = sc.next();
			int sum=0, avg;
			for(int j=0;j<3;j++) {				
				System.out.printf("%s > ",subjects[j]);
				scores[i][j]= sc.nextInt();
				sum+=scores[i][j];
			}
			scores[i][3]=sum;
			avg=sum/3;
		}
//		name= new String[]{"a","b","c","d","e"};
//		scores = new int[][]{{80,70,90,240,80},{70,70,70,210,70},{60,70,80,210,70},{75,90,65,230,76},{60,80,50,190,63}};
		//���� �ʱ�ȭ
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
		}
		//���� �ű��
		for(int i=0;i<rank.length-1;i++) {
			for(int j=i+1;j<rank.length;j++) {
				if(scores[i][3]>scores[j][3]) {
					rank[j]++;
				}else if(scores[i][3]<scores[j][3]) {
					rank[i]++;					
				}
				System.out.println();
			}
			System.out.println();
		}
		//���
		System.out.println("�̸�\t\t����\t\t����\t\t����\t\t����\t\t���\t\t����");
		System.out.println("==================================");
		for(int i=0;i<num;i++) {
			System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
					name[i],scores[i][0],scores[i][1],scores[i][2],scores[i][3],scores[i][4],rank[i]);
		}
		sc.close();
	}
}
