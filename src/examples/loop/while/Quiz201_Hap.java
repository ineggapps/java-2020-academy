public class Quiz201_Hap {
	public static void main(String[] args) {
/*		
		1-2+3-4... ���� �������� 100�̻��� �Ǵ� �ּ��� ���� ��
*/
		int s, n;
		
		n=0;
		s=0;
		while(s<100) {
			n++;
			
			s = n%2==1 ? s+n : s-n;
		}
		System.out.println("n : " + n +", s : " + s);
	}
}
