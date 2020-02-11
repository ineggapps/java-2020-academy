package d200211;

public class Ex7 {
	public static void main(String[] args) {
		Test7 tt = new Test7();
		int result;
		result = tt.sum(20);
		System.out.println("결과:" + result);
		System.out.println("4는 짝수? " + tt.isEven(4));
		char c = 'g';
		System.out.println(c + "를 대문자로 고치면? " + tt.upper(c));
		System.out.println(c + "는 대문자? " + tt.isUpper(c));
		int a = 1, b = 10;
		result = tt.sum2(a, b);
		System.out.printf("%d에서 %d까지의 합은 %d입니다.%n", a, b, result);
		tt.gugu(2);
		tt.gugu(17);
		int score = 88;
		System.out.println(score + "점은 " + tt.grade(score) + "입니다.");
	}
}

class Test7 {
	public int sum(int n) {// n: 매개변수(파라미터)
		// 매개변수도 지역변수의 일종이라고 보면 된다.
		// ★매개변수는 지역변수와 동일하게 스택 영역에 저장된다
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += n;
		}
		return s;
	}

	// 매개변수로 전달된 정수가 짝수인지 판별하는 메서드
	public boolean isEven(int n) {
		return (n & 1) == 0;
	}

	// 매개변수로 전달 받은 문자 중 소문자를 대문자로 변환하는 메서드
	public char upper(char ch) {
		return (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
	}

	// 매개변수로 전달된 문자가 대문자인지 판별
	public boolean isUpper(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// 두 정수를 매개변수로 전달받아 작은 수에서 큰 수까지 합 구하기
	public int sum2(int a, int b) {
		int t, s = 0;
		// a가 작은 수가 되도록 정렬하기
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		for (int i = a; i <= b; i++) {
			s += i;
		}
		return s;
	}

	// 매개변수를 입력 받아서 해당하는 수의 구구단표를 출력
	public void gugu(int dan) {
		if(dan<1 || dan>9){
			System.out.println("1~9단까지만 입력이 가능합니다");
			return;
		}
		System.out.println(dan + "단 출력");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %2d%n", dan, i, dan * i);
		}
		return; // return type이 void형인 경우에는 생략이 가능하다
		// return type이 void형인 경우에는 메서드를 실행한 후 호출한 곳으로 돌아간다.
		// 값을 넘겨줄 일이 없는 경우에 void형을 이용하여 메서드를 작성한다.
	}

	// 파라미터로 전달 받은 점수를 이용하여 평점 계산
	// 단, 입력받은 점숫값에는 오류가 없다는 가정 하에 작성한다.
	public double grade(int s) {
		double n;
		if (s >= 95) {// if(s>=95 && s<=100) 에서 점수가 오류가 없다고 가정하였으므로 s<=100의 조건식은 작성하지 않는다
			n = 4.5;
		} else if (s >= 90) {
			n = 4.0;
		} else if (s >= 85) {
			n = 3.5;
		} else if (s >= 80) {
			n = 3.0;
		} else if (s >= 75) {
			n = 2.5;
		} else if (s >= 70) {
			n = 2.0;
		} else if (s >= 65) {
			n = 1.5;
		} else if (s >= 60) {
			n = 1.0;
		} else {
			n = 0;
		}
		return n;
	}
}