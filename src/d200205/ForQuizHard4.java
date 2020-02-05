package d200205;

public class ForQuizHard4 {
	public static void main(String[] argsW) {
		//1-2+3-4...+9-10 의 결과를 출력하는 프로그램
		int s =0;
		int n;
		for(int i=1;i<=10;i++) {
			n = (i&1)==1?i:-i;
			s+= n;
			System.out.printf("%s ",n>0?n:-n);//부호 제거
			if(i<10) {
				//다음 연산자를 입력해 줘야 하는 것이므로 음수일 경우 다음 부호 +를 입력해 준다.
				System.out.printf("%s ",n>0?"-":"+");
			}
		}
		System.out.printf("= %d%n",s);
	}
}
