package d200214;

public class Ex2 {
	public static void main(String[] args) {
		//문자열은 문자열 상수 영역에 저장된다. (힙 영역)
		//1) 문자열을 저장하고 저장된 주솟값을 s1에 대입
		String s1 = "seoul";
		//2) 동일한 문자열을 s2에 대입하는 경우 "seoul"이라는 문자열객체가 이미 존재하므로 "seoul"의 주솟값을 s2에 대입
		String s2 = "seoul";
		//3) 또 다른 "seoul"이라는 문자열 객체가 새로 생성되고 새로 생성된 객체의 주솟값이 s3에 대입된다.
		String s3 = new String("seoul");
		//== 객체에서 ==는 주솟값을 비교한다.
		System.out.println(s1 == s2);//주소가 동일하다.
		System.out.println(s1 == s3);//주소가 다르다
		System.out.println(s1.equals(s2));//String의 equals메서드는 같은 값인지를 비교한다. Object의 equals 메서드를 오버라이딩하였다.
		System.out.println(s1.equals(s3));

		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);

		//서로 같은 객체면 해시코드는 동일하다. 하지만 역은 성립하지 않는다.
		//이곳에서도 마찬가지로 서로 다른 객체인데도 hashCode는 동일하다. 
		System.out.println("s1:" + s1.hashCode());
		System.out.println("s2:" + s2.hashCode());
		System.out.println("s3:" + s3.hashCode());
	}
}
