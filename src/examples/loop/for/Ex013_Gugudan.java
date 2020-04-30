public class Ex013_Gugudan {
	public static void main(String[] args) {
/*
		 2~9단까지의 구구단을 출력하는 프로그램
*/	
		int c;
		
		for(int a=2; a<=9; a++) {
			System.out.println(">> "+ a + "단 <<");
			for(int b=1; b<=9; b++) {
				c=a*b;
				System.out.printf("%d * %d = %d\n", a, b, c);
			}
			System.out.println();
		}
	}
}
