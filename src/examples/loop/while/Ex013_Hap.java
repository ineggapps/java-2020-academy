public class Ex013_Hap {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...+(1+2+3+...+10) ���� ���
		int n, s, ss;
		
		n=0;
		s=ss=0;
		while(n<10) {
			n++;
			s+=n;
			ss+=s;
		}
		System.out.println("��� : "+ss); // 220
	}
}
