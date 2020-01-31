package d200131;

import java.util.Scanner;

public class OperEx7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char a, b;
		System.out.print("문자 하나 입력? ");
		a = sc.next().charAt(0);
		// 한 문자를 입력 받아 소문자이면 대문자로, 대문자이면 소문자로 출력하는 방법
		// 65 => 97 (97-65=32)
		// 대문자 -> 소문자, 소문자-> 대문자, 기타 -> 기타
		// 대문자이면 32를 더하여 소문자로 변환하고 소문자이면 32를 차감하여 대문자로 변환한다.
		//b = a >='A' && a<= 'Z' ? (char) (a + 32) : (char)(a - 32);
		//↑ 대문자 이외의 모든 문자에서 32만큼을 뺴는 구문이므로 의도가 맞지 않다.
		b = a >='A' && a<= 'Z' ? 
				(char) (a + 32) : //대문자인가? true
				a>='a' && a<='z' ? //대문자인가? false일 때 다시 조건 비교
						(char)(a - 32): a; //소문자인가? true:false
		System.out.println(a + " ▶ " + b); 

		sc.close();
	}
}
