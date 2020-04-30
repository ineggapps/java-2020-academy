package d200204;

public class ForEx1 {
	public static void main(String[] args) {
		int n;
//		for(n=1;n<=10;n++) {//for(초기;조건;증감식)
//			System.out.println("안: "+ n);//1 2 3 ... 9 10
//		}
//		//n이 10이 되어 출력한 이후
//		//다시 증감식을 수행한 다음 조건을 비교하므로
//		//밖으로 빠져나왔을 때의 n의 값은 11이 된다. 
//		System.out.println("밖: " +n);

		
		//for문장 작성의 바람직하지 않은 예
		n=1;
		for(;n<=10;) {
			System.out.println("안: "+n);
			n++;
		}
		System.out.println("밖: " +n);
		
	}
}
