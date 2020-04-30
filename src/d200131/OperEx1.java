package d200131;

public class OperEx1 {
	/*
	 * a+=b; //byte, short, char 에서 형 변환이 일어나지 않는다는 장점이 있다. (∵연산 속도가 빠름)
	 * a=a+b; // byte, short, char에서 int 형으로 변환이 일어난 뒤에 연산을 수행한다.
	 * 
	 * a-=b;
	 * a=a-b;
	 */
	public static void main(String[] args) {
		short a, b;
//		a+=b;//The local variable a may not have been initialized error.
		a = 10;
		b = 5;
		a = (short) (a + b);
//		a=a+b;//int로 형 변환이 일어나므로 오류가 발생한다
		System.out.println(a);
		a += b;// 배정연산자에서는 형 변환이 일어나지 않으므로 연산 속도가 더 빠르다.
		System.out.println(a);

		char c = 'A';
		c += 10;
		System.out.println(c);

		float f = 3.5f;
		char ch = 'A';
		ch+=f; //float형과의 배정연산을 수행하였어도 형변환이 일어나지 않는다.
		//65+3.5=68.5라는 연산이 나오지만 컴파일러에서 별도로 소숫점을 절삭하여 68의 결괏값인 D가 출력되도록 한다.
		System.out.println(ch);
		f=3.5f;
		ch='A';
		f+=ch;
		System.out.println(f);
	}
}