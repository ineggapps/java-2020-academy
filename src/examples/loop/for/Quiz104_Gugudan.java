public class Quiz104_Gugudan {
	public static void main(String[] args) {
/*
		 2~9�ܱ����� �������� ���η� ����ϴ� ���α׷�
*/	
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%1d*%1d=%2d\t", j, i, (j*i));
			}
			System.out.println();
		}
	}
}
