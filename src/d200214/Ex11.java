package d200214;

public class Ex11 {
	public static final int RANGE=99000;
	public static void stringBufferTime() {
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		
		for(int i=1;i<RANGE;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("문자열 길이:"+sb.length());
		System.out.println("실행시간:"+(end-start)+"ms");
	}
	
	public static void stringBuilderTime() {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		
		for(int i=1;i<RANGE;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("문자열 길이:"+sb.length());
		System.out.println("실행시간:"+(end-start)+"ms");
	}
	
	public static void stringTime() {
		long start = System.currentTimeMillis();
		String s= "a";
		for(int i=1;i<RANGE;i++) {
			s+="a";
		}
		long end = System.currentTimeMillis();
		System.out.println("문자열 길이:"+s.length());
		System.out.println("실행시간:"+(end-start)+"ms");
	}
	
	public static void main(String[] args) {
		//연산 수행 시 StringBuilder로 변환하여 문자열을 더하면 성능이 떨어진다.
//		String s ="서울";
//		s+="부산";
//		s+="대구";
//		s+="인천";
//		s+="광주";
//		System.out.println(s);
		
		//StringBuilder, StringBuffer는 사용해야 할 경우와 그렇지 않은 경우로 나뉜다.
		//StringBuilder와 StringBuffer의 궁극적인 차이는 동시성의 지원유무이다.
		//동시성을 지원하면 속도는 느려지지만 정확성은 높아진다.
		//동시성을 지원하는 클래스는 StringBuffer이다.
		//반면, StringBuilder는 동시성을 지원하지 않으므로 단일스레드 환경에서 사용할 때 유리하다. 
		//(StringBuilder는 속도가 좀 더 빠르다)
		
		stringBufferTime();
		stringBuilderTime();
		stringTime();
		
	}
}
