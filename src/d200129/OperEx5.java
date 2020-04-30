package d200129;

public class OperEx5 {
	public static void main(String[] args) {
		char a, b;
		a = 65;// a='A';
		// b=a+10; // 컴파일 오류; char+char => int+int => int 결괏값 형태가 int형인 것을 char형 변수에 대입할 수 없다.
		b=(char)(a+10);
		System.out.println(b);
	}
}
