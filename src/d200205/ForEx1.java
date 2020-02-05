package d200205;

public class ForEx1 {
	public static void main(String[] args) {
		//다중for문 예제
		for(int i=1;i<=3;i++) {
			System.out.println("i:"+i);//3번 실행
			for(int j=1;j<=2;j++) {
				System.out.println("i:"+i+", j:"+j);//i가 3번 X j가 2번씩 = 실행 시 총 6번 실행됨
			}
			System.out.println("----------------------");//3번 실행
		}
	}
}
