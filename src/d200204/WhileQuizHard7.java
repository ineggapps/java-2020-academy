package d200204;

import java.util.Scanner;

public class WhileQuizHard7 {
	//양의 정수를 입력 받아 입력 받은 정수를 뒤집어 출력하는 프로그램 작성하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,reverse=0;
		int tmp=1,size=0,cnt=0,down=1, up=1;
		do {			
			System.out.print("수? ");
			num = sc.nextInt();
		}while(num<0);
		
		//124가 왔을 때 421이 출력되도록 하는 것만 생각
		//cnt는 자릿수 매기기
		tmp=num;
		while(tmp!=0) {
			tmp/=10;
			size++; //길이를 발견할 때마다 1씩 증가
		}
		//자릿수-1은 10의 지수임
//		System.out.println("입력 받은 값의 10의 지수는 "+(size-1));
		
		//자릿수-1로 지수 만들기
		cnt=size-1;
		tmp=num;
		while(cnt>0) {
			cnt--;
			down*=10;
		}
		
		//124일 경우 down=100이 됨
		//up=1부터 시작 (10을 누적하여 곱함)
		cnt=size;
		tmp=num;
		while(cnt>0) {//3회 반복 (cnt=3, 2, 1) 그리고 0이 될 때 조건비교 후 종료
			cnt--;//아래의 구문에서는 2 , 1, 0으로 활용하면 된다.
			reverse+=(tmp/down) * up ;
//			System.out.println((tmp/down) * up);
//			System.out.println("tmp전: "+tmp);
//			System.out.printf("((%d/%d)*%d)*%d=%d%n",tmp,down,up,down,((tmp/down) * up )*down);
			tmp-= (tmp/down )*down;
//			System.out.println("tmp후: "+tmp);
//			System.out.printf("reverse=%d\t tmp=%d\t down=%d\t up=%d%n",reverse,tmp, down,up);
			down/=10;
			up*=10;
//			System.out.println("===");
		}
		
		//자릿수를 역으로 곱하고 더하면서 숫자 뒤집기
//		cnt=size;
//		tmp=num;
//		while(cnt>0) {
////			System.out.println(size-cnt+","+cnt);// size-cnt: 0 1 2 / cnt: 3 2 1
//			reverse += tmp/(10*(cnt-1)) * 10*(size-cnt);
//			System.out.printf("tmp=%d cnt=%d 으=%d\n",tmp, cnt, (tmp/(10*(cnt-1))));
//			System.out.printf("reverse: %d / tmp/(cnt-1)=%d\n",reverse,tmp/(cnt-1));
//			tmp %=(cnt-1);
//			System.out.printf("tmp: %d%n",tmp);
//			cnt--;		
//		}
		
		System.out.printf("원래의 수: %d%n",num);
		System.out.printf("뒤집은 수: %d%n",reverse);
		sc.close();
	}
}
