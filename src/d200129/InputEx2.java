package d200129;

//Ctrl+Shift+o: auto import
import java.util.Scanner;

public class InputEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, tel;
		int age;

		System.out.print("이름? ");
		name = sc.nextLine(); // 중간에에 공백을 허용한다
		System.out.print("나이? ");
		age = sc.nextInt();
		sc.nextLine();// 이미 윗줄에서 nextInt()에서 숫자를 입력하면서 엔터값까지 입력받았으므로 이를 인식하여 입력을 종료한다.
		System.out.print("전화번호? ");
		tel = sc.nextLine();

		System.out.format("\nname:%s, age:%d, tel:%s", name, age, tel);
		sc.close();
	}
}
