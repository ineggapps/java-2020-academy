package d200205;

public class ForEx4 {
	public static void main(String[] args) {
		int c;
		System.out.println("구구단");
		for(int a=2;a<=9;a++) {
			for(int b=1;b<=9;b++) {//2~9단 총 8개의 (8) 숫자를 X 1~9까지 (9) = 72번 반복
				c=a*b;
				System.out.printf("%d*%d=%2d\t",a,b,c);
			}
			System.out.println("\n");
		}
	}
}
