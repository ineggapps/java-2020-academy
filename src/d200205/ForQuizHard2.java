package d200205;

public class ForQuizHard2 {
	public static void main(String[] args) {
		 //3x+6y=27�� ��� �ظ� ���ϴ� ���α׷��� �ۼ�
		//x�� y�� �����̰� ������ ������ 0<=x,y<=10 �̴�.
		int dap=27;
		int n;
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				n=3*x + 6*y;
				if(n==dap) {
					System.out.printf("[%d,%d]%n",x,y);
				}
			}
		}
	}
}
