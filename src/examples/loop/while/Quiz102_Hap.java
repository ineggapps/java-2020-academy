public class Quiz102_Hap {
	public static void main(String[] args) {
/*		
		1-2+3 ... +9-10 �� ���� ���
*/
		int n = 0, s = 0;
		while(n < 10) {
			n++;
			s+=n;
			n++;
			s-=n;
		}
		
/*			
		int n, s;
		n = s = 0;
		while(n < 10) {
			n++;
			if(n%2==0)
				s-=n;
			else
				s+=n;
		}
*/

		System.out.println("��� : " + s);
	}
}
