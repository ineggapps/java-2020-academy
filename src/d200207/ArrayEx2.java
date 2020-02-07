package d200207;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		/*
		 5명의 이름과 점수를 입력 받아
		 이름 점수 편차(점수-평균)을 출력하는 프로그램을 작성하자.
		*/
		
		Scanner sc = new Scanner(System.in);
		String[] name=new String[5];
		int []score = new int[5];
		int tot, ave;
		
		tot=0;
		for(int i=0;i<name.length;i++) {
			System.out.print((i+1)+" 번째 이름: ");
			name[i]= sc.next();
			System.out.print("\t점수: ");
			score[i]= sc.nextInt();
			
			tot+=score[i];//입력 받은 점수의 합 구하기
		}
		//평균 계산
		ave=tot/name.length;
		
		//출력
		System.out.println("이름\t\t점수\t\t편차("+ ave +")");
		for(int i=0;i<name.length;i++) {
			//이곳에서는 향상된 for문을 사용할 수 없다.
			//각각 자료형이 다른 변수를 여러 개 활용하고 있기 때문이다.
			System.out.printf("%s\t\t%d\t\t%d\n",name[i],score[i],score[i]-ave);
		}
		sc.close();
	}
}
