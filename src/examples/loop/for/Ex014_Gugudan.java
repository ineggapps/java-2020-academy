public class Ex014_Gugudan {
	public static void main(String[] args) {
/*
		 2~9단 까지의 구구단을 출력하는 프로그램
*/	
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%1d*%1d=%2d\t", i, j, (i*j));
			}
			System.out.println();
		}
	}
}
