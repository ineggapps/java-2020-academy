package d200214;

public class Ex12 {
	/**
	 * StringBuffer, StringBuilder : 가변적인 문자열을 처리하는 경우 String보다 유리 
	 * StringBuilder:동기화를 지원하지 않음. StringBuffer보다 빠름 
	 * StringBuffer: 동기화 지원. 멀티 스레드에서 안전 한 줄의 문자열을 처리하는 경우에는 String이 더 유리
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1);
		System.out.println(sb1);
		System.out.println(sb1 == sb2);// 주소 비교
		System.out.println(sb1.equals(sb2)); // ★ false (주솟값을 비교하기 때문)
		// 문자열을 비교하기 위해서는 String으로 변환 후 비교하자!
		System.out.println(sb1.toString().equals(sb1.toString()));// true
		System.out.println("길이: " + sb1.length());// 5(korea)

		StringBuffer sb3 = new StringBuffer();
		System.out.println("초기버퍼크기:" + sb3.capacity());// 16

		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("대한민국");
		sb3.append("우리나라");
		sb3.append("자바");
		sb3.append("스프링");
		System.out.println("append 후 버퍼크기:" + sb3.capacity());// 버퍼: 34, 부족 시 자동으로 늘린다.
		
		System.out.println(sb3);
		System.out.println(sb3.indexOf("자바"));

		String s2 = sb3.toString();
		System.out.println(s2.toUpperCase());
		
		//맨 앞에 한국 문자열 삽입
		sb3.insert(0, "한국");
		System.out.println(sb3.toString());
		
		//korea 앞에 super 문자열 삽입
		sb3.insert(sb3.indexOf("korea"),"super");
		System.out.println(sb3.toString());

		//korea 뒤에 사랑 문자열 삽입
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"사랑");
		System.out.println(sb3.toString());
		
		//대한민국 문자열 지우기
		sb3.delete(sb3.indexOf("대한민국"), sb3.indexOf("대한민국")+"대한민국".length()); //(end-1) 인덱스까지 삭제
		System.out.println(sb3.toString());
		
		//korea 문자열부터 끝까지 지우기
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3.toString());
		
		System.out.println("길이:"+sb3.length()+", 버퍼 크기: "+sb3.capacity());//버퍼 크기 여전히 34
		sb3.trimToSize();//버퍼의 크기를 문자열 길이로 
		System.out.println("길이:"+sb3.length()+", 버퍼 크기: "+sb3.capacity());//버퍼 크기 줄이면 문자열의 길이만큼만 잡힘
		
		System.out.println("★"+sb1+"★");
		sb1.delete(0, sb1.length());
		System.out.println("★"+sb1+"★");
		
		//객체 안의 내용물을 지우는 효과를 내는 다른 방법
		System.out.println("★"+sb2+"★");
		sb2 = new StringBuffer();
		//새로운 객체를 생성하면 이전에 쓰인 객체의 주솟값이 아닌 새로 생성된 곳의 주솟값을 가리킬 테니까.
		System.out.println("★"+sb2+"★");
	}
}
