public class Ex014_Hap {
	public static void main(String[] args) {
/*
		1/2+2/3+3/4+...+9/10�� ����� ����ϴ� ���α׷�
*/
		int n;
		double s;
		
		n=0;
		s=0;
		while(n<9) {
			n++;
			s+=(double)n/(n+1);
			// s=s+(double)n/(n+1);
		}
		System.out.println("��� : "+s); // 7.071031746031746
	}
}
