package d200128;

public class TypeEx2 {	
	public static void main(String[] args) {
		byte a,b,c;//-128~127까지만 표현할 수 있다.
		
		a=25; //'A'~'Z':65~90, 'a'~'z': 97~122
		b='A';
		System.out.println(a+","+b);

		//		c=90;
//		c=a+b;//mismatch error: cannot convert to from int to byte
		//결과가 int형이므로 int 는 byte에 대입할 수 없다. (byte+byte의 연산일지라도 컴퓨터 자동으로 int형으로 변환해 준다)
		c=(byte)(a+b);// int형을 byte형으로 강제 변환하여 대입
		System.out.println(c);
		
//		c=200; //컴파일 오류
		c=(byte)200; //컴파일 오류
		System.out.println(c);
	}
}
