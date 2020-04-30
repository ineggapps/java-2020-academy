﻿package h200130;

public class OperatorEx21 {
	public static void main(String[] args) {
		System.out.printf("10 == 10.0f\t %b%n", 10==10.0f);
		System.out.printf("10 == 10.0f\t %b%n", 10==10.0f);
		/*
			정수 == 실수형 비교 시에는 
			실수형으로 변환된 정수 == 실수형으로 비교를 실시한다.
			∴ 정수형에서 실수형으로 변환된 10은 10.0f가 될 것이고 10.0f와 비교하면 결괏값은 true가 나온다.
		 * */
		System.out.printf("'0' == 0\t %b%n", '0' == 0);
		/*
		 	문잣값인 '0'과 정숫값인 0을 비교하는 연산은 false가 나온다.
		 	홑따옴표 안에 들어가는 하나의 글자는 문잣값을 의미한다.
		 	따라서 '0'은 문잣값이다.
		 	하지만, '0'을 정수형으로 변환하면 48이 된다. (ASCII 코드에 대응하는 값)
		 	그런데, 48은 0과 같지 않기 때문에 ==연산을 수행하였을 경우에는 false가 반환된다.
		 * */
		System.out.printf("'A' == 65\t %b%n", 'A' == 65);
		/*
		 	문잣값인 'A'는 정수형으로 변환하면 65가 된다. (ASCII 코드에 대응하는 값)
		 	그러므로 문잣값 'A'와 정수 65가 같은지 비교하는 연산에서는 true값이 반환이 된다.
		 * */
		System.out.printf("'A' > 'B'\t %b%n", 'A' > 'B');
		/*
		 	'A'의 문잣값에 대응되는 정숫값은 65이고, 'B'는 66이다.
		 	따라서 'A' > 'B'의 조건을 정숫값으로 변환하면 65>66이다.
		 	그러나 65는 66보다 크지 않으므로 false를 반환한다.
		 * */
		System.out.printf("'A'+1 == 'B'\t %b%n", 'A'+1 == 'B');
		/*
		 	'A'의 문잣값에 대응되는 정숫값은 65이다. 여기에 1을 더하면 66이 된다.
		 	따라서 'A'+1 == 'B'의 식을 정숫값으로 변환하면 66==66이다.
		 	66은 66과 같다고 할 수 있으므로 true를 반환한다.
		 * */
	}
}
