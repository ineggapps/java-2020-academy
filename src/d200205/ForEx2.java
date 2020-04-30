package d200205;

public class ForEx2 {
	public static void main(String[] args) {
		//다중for문 예제
		for(int i=1;i<=3;i++) {
			System.out.println("i:"+i);
			for(int j=1;j<=i;j++) {//i가 일 때 1번, 2일 때 2번, 3일 때 3번 => 총 6번 실행
				System.out.println("i:"+i+", j:"+j);
			}
			System.out.println("----------------------");
		}
	}
}
