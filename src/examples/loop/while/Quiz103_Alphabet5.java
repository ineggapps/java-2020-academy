public class Quiz103_Alphabet5 {
	public static void main(String[] args) {
/*		
		A~Z ������ �����ڸ� �� �ٿ� 5���� ���
*/
		char ch='A';
		int cnt;
		
		cnt=0;
		while(ch<='Z') {
			System.out.print(ch+"\t");
			
			cnt++;
			if(cnt==5) {
				System.out.println();
				cnt=0;
			}
			
			ch++;
		}
	}
}
