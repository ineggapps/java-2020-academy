public class Ex018_MultiWhile {
	public static void main(String[] args) {
/*
		2~9�� ���� ������ ��� 
*/
		int dan, n;
		
		dan = 2;
		while(dan<=9) {
			System.out.println("*** "+dan+"�� ***");
			n=0;
			while(n<9) {
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan*n);
			}
			System.out.println();
			dan++;
		}
	}
}
