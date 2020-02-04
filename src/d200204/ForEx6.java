package d200204;

public class ForEx6 {
	public static void main(String[] args) {
		int n,s;
		s=0;
		for(n=1;n<=10;n++) {
			s++;
			System.out.println("안:" +n+", " + s);
			//n은 반복문이 만족할 동안 1씩 증가하여 출력한다.
			//1 2 3 4 5 6 7 8 9 10
			//s는 반복문이 만족할 동안 1씩 증가하여 출력한다.
			//1 2 3 4 5 6 7 8 9 10
		}
		//하지만 n은 증감식을 실행하고 조건식을 비교하는 작업을 수행하므로 n은 11의 값이 된다.
		//s는 증감식에서 언급되지 않았으므로 s값은 변화가 없다.
		System.out.println("밖:" +n+", " + s);
	}
}
