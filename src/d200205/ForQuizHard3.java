package d200205;

public class ForQuizHard3 {
	public static void main(String[] args) {
		//a+b+c=25를 만족하는 한 자리 자연수 a,b,c를 모두 구하는 프로그램 작성하기.
		int start =1;
		int end=9;
		for(int a=start;a<=end;a++) {
			for(int b=start;b<=end;b++) {
				for(int c=start;c<=end;c++) {
					if(a+b+c==25) {
						System.out.printf("%d+%d+%d=25%n",a,b,c);
					}
				}
			}
		}
	}
}
