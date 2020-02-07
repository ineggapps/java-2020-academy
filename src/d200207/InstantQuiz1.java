package d200207;

public class InstantQuiz1 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 난수를 100개 발생하여 한 줄에 10개씩 출력하고
		 * 마지막줄에 발생된 난수의 짝수와 홀수의 개수 출력하기
		 * */
		int num[]= new int[10];
		int tmp;
		int even,odd;
		for(int i=1;i<=100;i++) {
			tmp = (int)(Math.random()*100)+1;
			System.out.printf("%d\t",tmp);
			if(i>=91) {
				//91번째부터 100번째까지의 값은 변수에 저장하기
				num[i-91]=tmp;
			}
			if(i%10==0) {
				//10개씩 출력될 때마다 줄바꿈하기
				System.out.println();
			}
		}
		even=odd=0;
		for(int i: num) {
			if((i&1)==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.printf("짝수의 개수: %d\n",even );
		System.out.printf("홀수의 개수: %d\n",odd);
		
	}
}
