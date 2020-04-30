package d200131;

public class OperEx4 {
	public static void main(String[] args) {
		char a='A';
		char b;
		
		b='A'+3;//★리터럴끼리의 연산은 형변환이 일어나지 않는다.
		System.out.println(a+","+b);
	
		//b=a+3; Error. 형 변환이 일어나서 int형으로 변환된다. 이것을 char형 변수인 b에 대입할 수 없다.
		b=(char)(a+3);
		System.out.println(a+","+b);
		
		b=60+20;//★리터럴끼리의 연산이 수행되었으므로 오류가 발생하지 않는다.
		//값 자체로 바라보기.
		/*
		 byte a = 10;
		 여기서 10이라는 리터럴은 int형인데도 불구하고 오류가 발생하지 않았다.
		 byte b = 200;
		 단, 변수형의 범위를 초과하는(-128~127) 경우에는 오류가 발생하므로 이 점에 유의한다.
		 */
		System.out.println(b);
	}
}
