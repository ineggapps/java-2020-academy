package d200210;

import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 5���� �̸��� ����, ����, ���� ������ �Է� �޾� ����, ��� �� ������ ó���ϴ� ���� ó�� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int num = 5;//5��
		String[] name = new String[num];
		String[] subjects = new String[] {"����","����","����"};
		int[][] scores = new int[num][3];//5���� ����, ����, ���� ���� �Է�
		int[] tot=new int[num];
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
//		scores = new int[][]{{80,70,90},{70,70,70},{60,70,80},{75,90,65},{60,80,50}};
//		tot = new int[] {240,210,210,230,190};
		//���� �ʱ�ȭ
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
		}
		//���� �ű��
		for(int i=0;i<rank.length-1;i++) {
			for(int j=i+1;j<rank.length;j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				}else if(tot[i]<tot[j]) {
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
					name[i],scores[i][0],scores[i][1],scores[i][2],tot[i],tot[i]/3,rank[i]);
		}
		sc.close();
	}
}
