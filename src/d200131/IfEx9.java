package d200131;

import java.util.Scanner;

public class IfEx9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("점수 ? ");
		n = sc.nextInt();

		if (n >= 90) {
			System.out.println(n + ": 수");
		} else if (n >= 80) { // if(n>=80 && n<90)이라는 의미와 같다. 하지만 이미 위의  if문에서 조건이 잘렸기 때문에 "&& n<90"까지 선언할 필요가 없음.
			System.out.println(n + ": 우");
		} else if (n >= 70) {
			System.out.println(n + ": 미");
		} else if (n >= 60) {
			System.out.println(n + ": 양");
		} else {
			System.out.println(n + ": 가");
		}

		sc.close();
	}
}
