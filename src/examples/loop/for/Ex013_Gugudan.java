public class Ex013_Gugudan {
	public static void main(String[] args) {
/*
		 2~9�ܱ����� �������� ����ϴ� ���α׷�
*/	
		int c;
		
		for(int a=2; a<=9; a++) {
			System.out.println(">> "+ a + "�� <<");
			for(int b=1; b<=9; b++) {
				c=a*b;
				System.out.printf("%d * %d = %d\n", a, b, c);
			}
			System.out.println();
		}
	}
}
