package d200205;

public class ForQuizHard4 {
	public static void main(String[] argsW) {
		//1-2+3-4...+9-10 �� ����� ����ϴ� ���α׷�
		int s =0;
		int n;
		for(int i=1;i<=10;i++) {
			n = (i&1)==1?i:-i;
			s+= n;
			System.out.printf("%s ",n>0?n:-n);//��ȣ ����
			if(i<10) {
				//���� �����ڸ� �Է��� ��� �ϴ� ���̹Ƿ� ������ ��� ���� ��ȣ +�� �Է��� �ش�.
				System.out.printf("%s ",n>0?"-":"+");
			}
		}
		System.out.printf("= %d%n",s);
	}
}
