public class Quiz104_Gugudan {
	public static void main(String[] args) {
/*
		 2~9단까지의 구구단을 가로로 출력하는 프로그램
*/	
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%1d*%1d=%2d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
}
