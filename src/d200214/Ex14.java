package d200214;

import java.util.StringTokenizer;

public class Ex14 {
	public static void main(String[] args) {
		String s = "java,css,html";
		
		String[] ss=s.split(",");
		for(String a:ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		//버전이 낮으면 String에 split기능이 없어서 StringTokenizer을 사용했어야 했다.
		//String split기능을 사용할 수 있다면 StringTokenizer클래스 사용을 권장하지 않는다.
		//∵ String의 split은 정규식으로 잘라낼 수 있음.
		StringTokenizer st = new StringTokenizer(s,",");
		String x;
		while(st.hasMoreTokens()) {//분리한 문자열이 있다면?
			x=st.nextToken();//기준 문자열 ,로 자른 문자열을 순서대로 넘긴다
			System.out.print(x+" ");
		}
		System.out.println();

		
		StringTokenizer st2 = new StringTokenizer(s,",",true);//boolean returnDelims이 true면 구분자도 입력되어 반환을 한다
		String x2;
		while(st2.hasMoreTokens()) {//분리한 문자열이 있다면?
			x2=st2.nextToken();//기준 문자열 ,로 자른 문자열을 순서대로 넘긴다
			System.out.print(x2);
		}
		System.out.println();
		
		
	}
}
