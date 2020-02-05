package d200205;

import java.util.Scanner;

public class ForQuizHard1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,apx=0;
		//받는 수, 가까운 수 저장변수
		int sub;
		//특정 수-7
		System.out.println("5개의 정수를 입력하세요...");
		for(int i=0;i<5;i++) {
			num = sc.nextInt();
			if(i==0) {
				//처음일 때 apx변수에 num 입력
				apx=num;
			}
			sub=num-7;
			if(sub==1 || sub==-1) {
				//처음이 아니면 apx변수와 현재 입력된 num의 변수와 무엇이 더 가까운지 비교할 것
				//단, 7과의 근삿값이 같다면 먼저 들어온 값을 출력해야 함.
				//(정수라고 하였으므로 7과의 근삿값은 최솟값이 -1이거나 1이므로 조건을 만족하면 apx변수에 값을 담고 break;
				apx=num;
				break;
			} else if(apx-7>sub) {
				//근삿값이 갱신되면
				apx=num;
			}
		}
		System.out.println("7에 가장 가까운 수: "+apx);
		sc.close();
	}
}
