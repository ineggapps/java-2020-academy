public class Ex008_Factorial {
	public static void main(String[] args) {
/*
		10!(���丮��, factorial : 1*2*3...*10) ����� ����ϴ� ���α׷�
*/
		int s, n;
		s=1;
		n=0;
		while(n<10) {
			n++;
			s*=n;
		}
		System.out.println("��� : "+s); // 3628800
	}
}
