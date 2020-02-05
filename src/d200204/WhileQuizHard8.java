package d200204;

import java.util.Scanner;

public class WhileQuizHard8 {
	//2 이상의 정수를 입력받아 소인수 분해하여 출력하는 프로그램 작성하기
	//Ex: 60 = 2*2*3*5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;//입력 받는 정수를 저장하는 변수
		int tmp;//입력 받은 정수에 소인수분해하여 중간 결괏값을 저장하는 변수
		int op;//나머지가 0이 될 때까지 소인수분해를 진행 (2, 3, 4, ...)
		//입력
		do {
			System.out.print("정수? ");
			num = sc.nextInt();
		}while(num<2);
		
		tmp=num;
		op=2;
		System.out.printf("%d = ",num);
		//처리
		while(tmp!=1) {
			//소인수분해는 2부터 시작한다.
//			System.out.println(tmp+","+op);
			if(tmp%op==0) {
				//나머지가 없을 때까지 연산값을 계속 나눈다.
				tmp/=op;
				System.out.print(op);
				if(tmp!=1) {
					//마지막에 곱하는 값에는 *를 뒤에 붙이지 않음
					System.out.print(" * ");
				}
			} 
			else {
				//나머지가 있다면 op를 올려서 나눠 본다.
				op++;
			}
		}
		//출력
		
		sc.close();
	}
}
