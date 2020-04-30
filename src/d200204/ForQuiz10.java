package d200204;

public class ForQuiz10 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%12==0) {
				//4와 6의 최소공배수는 12이다.
				System.out.printf("%d\t",i);
			}
		}
	}
}
