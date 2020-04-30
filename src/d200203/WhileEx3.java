package d200203;

public class WhileEx3 {
	public static void main(String[] args) {
		int n;
		n=1;//초기화가 필요하다
		while(n<10) {//while(조건) { //조건: true또는 false만 가능하다
			n+=2;
			System.out.println("안:"+n); // 3 5 7 9 11
		}
		System.out.println("밖:"+n);//11
	}
}