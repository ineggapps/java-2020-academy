package d200205;

public class ForQuizHard8 {
	/*
	 * ��Ÿ����� ������ �����ﰢ������ ������ �� �� ���� ���̸� a,b��� �ϰ� ������ ���̸� c��� �ϸ� a^2+b^2=c^2�� ������
	 * �����Ѵ�. �� ���� ���̰� 10���� �۰ų� ���� �ﰢ�� �ֿ��� ��Ÿ����� ������ �����ϴ� �����ﰢ���� ���� �� �� ���� a,b,c�� ����
	 * ����ϸ�? ���⼭ �� ���� ���̶�� �ϴ� ���� �ڿ����� �ǹ��Ѵ�. ���� 0< ���� ����<=10 �� �ȴ�.
	 */
	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		int n,cnt=0;
		for (int a = start; a <= end; a++) {
			for (int b = start; b <= end; b++) {
				for (int c = start; c <= end; c++) {
					n=a*a+b*b;
					if(n==c*c) {
						cnt++;
						System.out.printf("a=%d, b=%d, c=%d%n",a,b,c);
					}
				}
			}
		}
		System.out.println("��ü ����: "+cnt);
	}
}
