public class Ex014_Gugudan {
	public static void main(String[] args) {
/*
		 2~9�� ������ �������� ����ϴ� ���α׷�
*/	
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%1d*%1d=%2d\t", i, j, (i*j));
			}
			System.out.println();
		}
	}
}
