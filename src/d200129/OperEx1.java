package d200129;

public class OperEx1 {
	public static void main(String[] args) {
		short a=10, b=5,c;
//		c=a+b;//Type mismatch: cannot convert int to short
		//결과는 int형으로 반환된다. int는 short에 대입할 수 없으므로 컴파일 오류가 발생한다
		c=(short)(a+b);
		System.out.println(c);
		
//		int x,y;
//		x=y+'A';//(y를 초기화하지 않을 경우) The local variable y may not been initialized
//		y가 초기화되지 않은 상태에서는 연산을 시작할 수 없다. 그러므로 컴파일 오류가 발생한다
		
		int x,y;
		y=10;
		x=y+'A';	
		System.out.println(x);//75라는 결괏값이 출력된다.
	}
}
