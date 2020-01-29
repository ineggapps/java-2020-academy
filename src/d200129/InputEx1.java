package d200129;

import java.util.Scanner;

public class InputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in을 키보드라고 생각
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("이름? ");
		name=sc.next();//문자열 입력 (중간에 공백 입력은 불가능)
		System.out.print("나이? ");
		age=sc.nextInt();//정수 입력
		System.out.print("성별[M/F]? ");
		gender=sc.next().charAt(0);//문자 입력
		System.out.print("키? ");
		height=sc.nextDouble();//실수 입력
		sc.close();//입력 자원을 다 사용하였으면 close하여 자원을 반납한다.
		
		System.out.format("이름:%s, 나이:%d, 성별:%C, 키:%f",name,age,gender,height);
	}
}
