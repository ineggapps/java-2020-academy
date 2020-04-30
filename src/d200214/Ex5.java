package d200214;

public class Ex5 {
	public static void main(String[] args) {
		String s = "    자      바    ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":");
		System.out.println(":" + s.replaceAll(" ", "") + ":");

		int a = 1234567;
		s = String.format("%,d", a);
		System.out.println(s);
		s = String.format("%1$,d %1$d %2$d", a, 20);
		System.out.println(s);

		s = "KOREA";
		System.out.println(s + "를 바이트로 고치면");
		byte[] bb = s.getBytes();// 문자열의 ASCII 코드값을 byte배열로 반환한다.
		for (byte b : bb) {
			System.out.print(b + "\t");
		}
		System.out.println();
		
		String s1 = new String(bb);
		System.out.println(s1);

		s = "대한민국";
		System.out.println(s);
		bb = s.getBytes();
		for (byte b : bb) {
			System.out.print(b+"\t");
		}
		System.out.println();
		
		String s2;
//		s2=123;//컴파일 오류 
		s2=""+123;//가능(권장하지 않음)
		
		s2= Integer.toString(999);//정수를 문자열로
		System.out.println(s2);
		
		s2="100";
		int n = Integer.parseInt(s2)+90;
		System.out.println(n+1);
	}
}
