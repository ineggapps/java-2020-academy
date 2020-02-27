package d200227;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		//Scanner 더 알아보기
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String tel;
		String birth;
		
		try {
			System.out.print("이름 ? ");
			name = sc.nextLine();//\n까지 읽어서 \n을 버리고 그 이전 문자열을 반환한다. 
			//그렇기 때문에 nextLine()메서드는 공백까지도 허용한다.

			System.out.print("나이 ? ");
			age = sc.nextInt();
			sc.nextLine();//nextInt()메서드에서 읽지 않은 \n 읽어서 버리기 위해 호출한다.
			//next() 또는 nextInt()는 기본적으로 단락 문자가 공백(엔터 포함)
			//으로 공백(엔터) 전까지 읽어서 반환한다.
			

			System.out.print("전화번호 ? ");
			tel = sc.nextLine();
			
			System.out.print("생일 ? ");
			birth = sc.nextLine();
			
			System.out.println(name+":"+age+":"+tel+":"+birth);
		} finally {
			sc.close();
		}
	}
}
