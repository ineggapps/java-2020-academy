package d200203;

public class WhileEx1 {
	public static void main(String[] args) {
		int n;
		n=0;//초기화가 필요하다
		while(n<10) {//while(조건) { //조건: true또는 false만 가능하다
			n++;
			System.out.println("안:"+n);
			/*
			 * n<0 n++ (n=1 출력) 1회 반복
			 * n<1 n++ (n=2 출력) 2회 반복 
			 * n<2 n++ (n=3 출력) 3회 반복
			 * n<3 n++ (n=4 출력) 4회 반복
			 * n<4 n++ (n=5 출력) 5회 반복
			 * n<5 n++ (n=6 출력) 6회 반복
			 * n<6 n++ (n=7 출력) 7회 반복
			 * n<7 n++ (n=8 출력) 8회 반복
			 * n<8 n++ (n=9 출력) 9회 반복
			 * n<9 n++ (n=10 출력) 10회 반복
			 * n<10 (false) (명령줄 수행하지 않고 블록 밖으로 나감)
			 * */
		}
		System.out.println("밖:"+n);
	}
}
