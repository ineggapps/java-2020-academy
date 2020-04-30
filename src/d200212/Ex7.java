package d200212;

public class Ex7 {
	public static void main(String[] args) {
		String s1="서울";
		String s2="서울";
		String s3=new String("서울");
		
		System.out.println(s1+":"+s2+":"+s3);
		
		// A == B : 여기서 ==은 객체이면 주솟값을 비교한다.
		System.out.println(s1==s2); // true 주솟값이 같으니까 true가 나왔다.
		System.out.println(s1==s3); // false  주솟값이 달라서 false가 나왔다.
		System.out.println(s1.equals(s3)); // true 주솟값을 비교하지 않고 문자열의 값을 비교했으므로 true가 나왔다.
	}
}
