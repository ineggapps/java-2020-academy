package d200203;

public class WhileEx2 {
	public static void main(String[] args) {
		int n;
		n=0;//초기화가 필요하다
		while(n<10) {//while(조건) { //조건: true또는 false만 가능하다
			n++;
			System.out.println("안:"+n);
			/*
			 * n<10 n+=2 (n=2 출력) 2회 반복 
			 * n<10 n+=2 (n=4 출력) 4회 반복
			 * n<10 n+=2 (n=6 출력) 6회 반복
			 * n<10 n+=2 (n=8 출력) 8회 반복
			 * n<10 n+=2 (n=10 출력) 10회 반복
			 * n<10 (false) (명령줄 수행하지 않고 블록 밖으로 나감)
			 * */
		}
		System.out.println("밖:"+n);
	}
}
