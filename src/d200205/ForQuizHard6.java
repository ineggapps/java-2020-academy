﻿package d200205;

public class ForQuizHard6 {
	public static void main(String[] args) {		
		//4~1000 사이의 수 중 완전수를 찾아 출력하는 프로그램 작성하기
		//자기 자신을 제외한 약수의 합이 같은 경우를 완전수라고 한다
		//예를 들어 6 = 1+2+3 이므로 6은 완전수이다.
		
		//그렇다면 약수를 먼저 구하는 프로그램을 작성해야겠네?
		//약수의 각각을 구할 필요는 없고 약수인 수만 누적하면 된다!
		int start=4;
		int end=1000;
		int sum; //약수의 합
		for(int i=start+1;i<end;i++) {
			sum=1;//약수의 합 초기화
			//단 1은 모든 수의 약수이므로 sum에는 0이 아닌 1을 누적한다
			//4와 1000사이 (4, 1000은 미포함)
			for (int j=2;j<i;j++) {//4와 1000사이의 숫자의 약수 하나씩 구하기. 단, 약수 중 자기 자신은 제외하므로 범위 설정에 유의한다.
				//반복문의 범위를 2로 설정하는 대신 sum에 1로 이미 누적을 하고 연산을 시작하였음.
				if(i%j==0) {
					sum+=j;//약수인 수를 누적할 것
				}
			}
			//약수의 합 연산이 완료되면 즉시 출력한다
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}
}
