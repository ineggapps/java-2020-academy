package d200214;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 이름을 입력 받아 입력 받은 이름 중 김씨의 인원수구하기
		// 단, 입력 받은 이름이 end이면 프로그램을 종료
		Scanner sc = new Scanner(System.in);
		String name;
		int cnt = 0;
		do {
			System.out.print("이름? ");
			name = sc.next();
//			name.indexOf("김")==0 으로 하거나...
			cnt = name.startsWith("김")? cnt + 1 : cnt;
		} while (!name.equals("end"));
		System.out.printf("김씨: %d명", cnt);
		sc.close();
	}

}
