public class Quiz104_Multiple35 {
	public static void main(String[] args) {
/*		
		1~100���� ���� 3 �Ǵ� 5�� ��� �հ� ���
*/
		int n, s, cnt;
		
		n=s=cnt=0;
		while(n<100) {
			n++;
			if(n%3==0||n%5==0) {
				// System.out.print(n+"\t");
				s+=n;
				cnt++;
			}
		}
		
		System.out.println("�� : "+s);
		System.out.println("��� : "+(s/cnt));
	}
}
