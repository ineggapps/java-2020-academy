package d200210;

import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String[] args) {
		// 5명의 이름과 국어, 여엉, 수학 점수를 입력 받아 총점, 평균 및 석차를 처리하는 성적 처리 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		int num = 5;//5명
		String[] name = new String[num];
		String[] subjects = new String[] {"국어","영어","수학"};
		int[][] scores = new int[num][3];//5명의 국어, 영어, 수학 점수 입력
		int[] tot=new int[num];
		int[] rank = new int[num];//랭킹
		//입력
		for(int i=0;i<num;i++) {
			System.out.printf("%d번째 이름 > ",i+1);
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
		//순위 초기화
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
		}
		//석차 매기기
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
		//출력
		System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t석차");
		System.out.println("==================================");
		for(int i=0;i<num;i++) {
			System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
					name[i],scores[i][0],scores[i][1],scores[i][2],tot[i],tot[i]/3,rank[i]);
		}
		sc.close();
	}
}
