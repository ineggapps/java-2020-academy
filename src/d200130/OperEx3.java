package d200130;

public class OperEx3 {
	public static void main(String[] args) {
		char a = 'A', b;

		// b = a + 1; 컴파일 오류 char + int => int + int => int 결괏값이 발생한다.
		b = (char) (a + 1);
		System.out.printf("%c, %c\n",a,b);

		//★ 증감연산(++, --): byte, short, char에서 연산 시 int로 형변환이 일어나지 않는다.
		//다만 ++, --의 위치에 따라 연산의 순서가 달라지는 것에 유의한다.
		b = ++a;
		System.out.printf("%c, %c\n",a,b);
		
		a = 'A';
		b = a++;//a의 문잣값을 대입한 후에 a값을 증가하는 연산을 수행한다.
		System.out.printf("%c, %c\n",a,b);
	}
}
