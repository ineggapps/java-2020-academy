package d200219;

public class Ex10 {
	public static void main(String[] args) {
		Object ob1 = new String("서울"); // 업 캐스팅
		Object ob2 = new String("서울"); // 업 캐스팅
		
//		System.out.println("길이: "+ ob1.length());//컴파일 오류
		System.out.println("길이: "+ ((String)ob1).length());//다운캐스팅
		
		System.out.println(ob1.equals(ob2));//■■주의■■ 오버라이딩된 메서드를 호출한다.
	}
}
