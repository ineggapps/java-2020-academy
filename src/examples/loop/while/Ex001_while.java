public class Ex001_while {
	public static void main(String[] args) {
/*
		1~10 ���� ������ ���
*/ 
		int n;
		n=0; // �ʱ�ȭ�� �ʿ�
		while(n<10) {
			n++;
			System.out.print(n+"  ");
		}
		System.out.println();
		// System.out.println(n); // 10
		
/*		
		int n=0; // ���� ����� ���ÿ� �ʱ�ȭ
		while(n++<10) {
			System.out.print(n+"  ");
		}
		System.out.println();
		System.out.println(n); // 11
*/
		
/*		
		int n=0;
		while(++n<=10) {
			System.out.print(n+"  ");
		}
		System.out.println();
		// System.out.println(n); // 11
*/		
	}
}
