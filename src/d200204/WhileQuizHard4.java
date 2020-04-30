package d200204;

import java.util.Scanner;

public class WhileQuizHard4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt=1;
		int before=0,current=1,tmp;
		System.out.print("개수 입력: ");
		n = sc.nextInt();

		System.out.printf("%d\t",0);//cnt 1개 카운트
		//0 1 1 2 3 5 8 
		while(cnt++<n && n>0) {
			//n=10일 경우 먼저 생각
			//current는 3번째 결괏값부터 만들어 낸다는 점을 감안
			System.out.printf("%d\t",current);
			tmp = before;
			before=current;
			current=tmp+current;//다음 항으로 이동
		}
		sc.close();
	}
}
