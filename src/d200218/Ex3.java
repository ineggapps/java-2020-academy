package d200218;

import java.text.DecimalFormat;

public class Ex3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0");
		String s;

		s = df.format(123456.123);
		System.out.println(s);//123,456 출력됨
		
	
		//#, 0 등 변환 문자에 관한 사항은 API를 참조.
//		DecimalFormat df2 = new DecimalFormat("#,##0.#");//소숫점이 1자리 but 정수=>정수 출력
		DecimalFormat df2 = new DecimalFormat("#,##0.0");//소숫점이 1자리. 정수여도 n.0 출력
//		s=df2.format(123456.173);//서식에 맞추어 소숫점 n+1번째 자리에서 반올림됨
		s=df2.format(123456);//서식에 맞추어 소숫점 n+1번째 자리에서 반올림됨
		System.out.println(s);
	}
}
