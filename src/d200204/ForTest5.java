package d200204;

public class ForTest5 {
	public static void main(String[] args) {
		//1~10까지 정수의 합을 계산하여 출력하는 프로그램
		int s=0;
		for(int i=1;i<=100;i++){
			s+=i;
		}
		System.out.println("결과: " + s);
	}
}
