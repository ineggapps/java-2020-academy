public class Quiz105_Hap {
	public static void main(String[] args) {
/*		
		1+2+...+n ������ ���� 100�� �Ѵ� �ּ��� n�� �����
*/
		int n=0, s=0;
		
		while(s <= 100) {
			n++;
			s+=n;
		}
		
		System.out.println("�ּ��� n : " + n);
		System.out.println("�� : " + s);
	}
}
