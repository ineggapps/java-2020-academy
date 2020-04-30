package d200203;
import java.util.Scanner;

public class SwitchEx8 {
	/*
	 * 점수를 입력 받아 수,우,미,양,가 구하기.
	 * 
	 * (단, 입력 받은 점수에는 오류가 없다)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		char grade;
		System.out.print("점수 입력(1~100): ");
		s = sc.nextInt();

		switch (s / 10) {// ※관계연산자는 이 자리에 올 수 없다.
		case 10:
		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
			break;
		}

		System.out.println(s + ": " + grade);
		sc.close();
	}
}
