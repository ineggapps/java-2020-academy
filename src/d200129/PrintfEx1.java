package d200129;

public class PrintfEx1 {
	public static void main(String[] args) {
		System.out.printf("%(d\n",123);//양수일 때 일반적인 출력
		System.out.printf("%(d\n",-123);//음수일 때 (숫자) 형식으로 출력 ∵ 회계에서 ()로 음수를 표시하는 경우가 있어서
		System.out.printf("%d\n",(int)'A');
		System.out.println("========================");
		System.out.printf("%% %d\n",0);//%문자는 %%를 입력
		System.out.printf("%f\n",123.23);//소수점 기본 6자리 출력
		System.out.printf("%f\n",12345e-03);
		System.out.printf("%.2f\n",123.236);//소수점 3번째 자리에서 반올림하여 2자리로 나타냄
		System.out.printf("%8.2f\n",123.24);//전체 자리 8자리 공간에 소수자리는 2자리만 출력. ('.'도 공간을 차지함)
		System.out.printf("%4.2f\n",123.24);//정수 자리가 넘칠 때는 무시하고 출력한다.
		
		System.out.printf("%10.5g\n",123.456);//10칸을 차지하지만 숫자는 5자리만 출력하여라. (숫자를 잘라야 하므로 소수점에서 반올림함)
		System.out.printf("%10.3g\n",123.556);//10칸을 차지하지만 숫자는 5자리만 출력하여라. (숫자를 잘라야 하므로 소수점에서 반올림함)
		System.out.printf("%10.2g\n",123.456);//10칸을 차지하지만 숫자는 2자리로 표현할 수 없으므로 지수단위로 표현함 Ne+00 (N≠0)
		//=> 앞에서 두 자리의 숫자를 잘라서 지수 형태로 표현하였다[1.2]e+02
		
		System.out.printf("%10.3e\n",123.456);//정수부분은 0이 아닌 정수가 와야 한다.
		System.out.printf("%10.4e\n",4584.2246);
		
		System.out.printf("%b\n",true);//%b는 boolean출력
		System.out.printf("%x\t",437);
		System.out.printf("%#x\n",437);
		System.out.printf("%X\t",437);
		System.out.printf("%#X\n",437);
		
		System.out.printf("%10.3s\n","Korea");
		System.out.printf("%10.3S\n","Korea");
		
		System.out.printf("%,d\n",1234567);
		System.out.printf("%(,d\n",1234567);
		System.out.printf("%(,.2f\n",1234567.557);
		
		System.out.printf("%d %d %d %d\n", 10,5,10,10);
		System.out.printf("%1$d %2$d %1$d %1$d\n", 10,5);//%1$d=(첫 번째 인수의 값), %2$d=(두 번째 인수의 값)
		/*
			Error 의 종류
			1. 컴파일오류: 문법 오류 - 컴파일할 때 검사하기
			2. 런타임오류: 실행할 때 발생하는 오류, 런타임 오류가 발생하면 프로그램 실행이 중지됨.
		*/
	}
}
