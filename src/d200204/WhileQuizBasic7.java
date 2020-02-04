package d200204;

public class WhileQuizBasic7 {
	public static void main(String[] args) {
		int x=100,y=0;
		int s=0;
		
		/*
		 x는 100부터 시작해서 1초마다 2씩 증가하고
		 y는 0부터 시작해서 5씩 증가한다. 몇 초 후에 y가 x를 따라잡는지와 따라 잡았을 때 x와 y의 값을 구하는 프로그램
		 * */
		
		/*
		 ★
		 100+2s<5s
		 1000/3<s 이므로
		 while문이 실행되는 조건은 정 반대이다.
		 따라서 x의 값>=y의 값.
		 (부등식 반전에 주의하자)
		 * */
		
		while(x>=y) {//x가 y보다 클 동안만 유효
			s++;
			x+=2;
			y+=5;
		}
		
		System.out.printf("x: %d, y: %d\n",x,y);
		System.out.printf("걸린 시간: %d초\n",s);
	}	
}
