import java.util.Scanner;

public class Quiz101_Grade {
	public static void main(String[] args) {
/*
		점수를 입력받아 수,우,미,양,가를 구하는 프로그램
*/
        Scanner sc=new Scanner(System.in);
        int s;
        char grade;

		System.out.print("점수 ? ");
		s = sc.nextInt();

		switch (s/10) {
		case 10:case 9: grade='수';break;
		case 8: grade='우';break;
		case 7: grade='미';break;
		case 6: grade='양';break;
		default: grade='가';break;
		}
		
		System.out.println("점수:"+s+", 판정:"+grade);
		
		sc.close();
	}
}
