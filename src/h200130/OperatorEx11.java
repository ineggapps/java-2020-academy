package h200130;

public class OperatorEx11 {
	/*
	자바의정석 p102 예제 3-11.
	선정 이유: char의 연산 이해하기
	 * */
	public static void main(String[] args) {
		char a = 'a'; // char의 문잣값인 'a'는 97이다.
		char d = 'd'; // char의 문잣값인 'd'는 97+3=100이다.
		char zero = '0'; // char의 문잣값인 '0'는 int로 표현하면 48이다.
		char two = '2'; // char의 문잣값인  '2'는 int로 표현하면 50이다.
		
		System.out.printf("'%c' - '%c' = %d%n",d,a,d-a);
		//%c는 char형 문잣값을 출력하므로 순차적으로 'd'와 'a'의 값을 출력한다.
		/*
		%d는 정숫값을 나타낸다.
		이때 a와 d의 변수는 char 형태로 정의되었지만 d-a와 같이 연산 시에는 int형으로 변환이 되어 연산이 수행된다.
		'd'의 값은 100을 의미하고 'a'의 값은 97을 의미하므로 100-97의 연산을 수행한 값인 3이 출력된다.
		 */
		System.out.printf("'%c' - '%c' = %d%n",two,zero,two-zero);
		//%c는 char형 문잣값을 나타내므로 순차적으로 '2'와 '0'의 문자를 출력한다.
		/*
		 %d는 정숫값을 나타내고 결괏값은 2가 나온다.
		 겉보기에는 2-0=2로 나타나는 것 같지만, zero와 two는 문자형인 char로 정의되어 있다.
		 따라서 여기에 들어가는 '0'과 '2'의 값은 각각 int형으로 나타내면 48과 50을 의미한다.
		 그러므로 '2'-'0'의 연산을 수행하면 int로 변환되어 50-48이 된다.
		 50-48의 결과인 2가 출력된다.
		 */
		System.out.printf("'%c'=%d%n",a,(int)a);
		//%c는 char의 문잣값과 대응하므로 a 변수의 값인 'a'가 출력된다.
		//%d는 int의 정숫값과 대응하므로 (int)a가 출력되는데, a는 int형으로 변환하면 97이 된다.
		System.out.printf("'%c'=%d%n",d,(int)d);
		//%c는 char의 문잣값과 대응하므로 d 변수의 값인 'd'가 출력된다.
		//%d는 int의 정숫값과 대응하므로 (int)d가 출력되는데, d는 int형으로 변환하면 100이 된다.
		System.out.printf("'%c'=%d%n",zero,(int)zero);
		//%c는 char의 문잣값과 대응하므로 zero 변수의 값인 '0'이 출력된다.
		//%d는 int의 정숫값과 대응하므로 (int)zero가 출력되는데, zero는 int형으로 변환하면 48이 된다.
		System.out.printf("'%c'=%d%n",two,(int)two);
		//%c는 char의 문잣값과 대응하므로 two 변수의 값인 '2'이 출력된다.
		//%d는 int의 정숫값과 대응하므로 (int)two가 출력되는데, two는 int형으로 변환하면 50이 된다.
	}
}
