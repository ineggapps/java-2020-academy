import java.util.Scanner;

public class Quiz107_Pass {
	public static void main(String[] args) {
/*
		이름과 세과목 점수를 입력 받아 협격 여부를 판별하는 프로그램
*/
		Scanner sc = new Scanner(System.in);

		String name;
		int com, excel, word;
		int tot, ave;
		String result;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("세과목 점수 ? ");
		com=sc.nextInt();
		excel=sc.nextInt();
		word=sc.nextInt();
		
		tot = com + excel + word;
		ave = tot / 3;

		if(com>=40 && excel>=40 && word>=40 && ave>=60) {
			result = "합격";
		}else if(ave<60) {
			result = "불합격";
		}else {
			result = "과락";
		}
		
		System.out.println(name+"님은 " + result+" 입니다.");
		
		sc.close();
	}
}
