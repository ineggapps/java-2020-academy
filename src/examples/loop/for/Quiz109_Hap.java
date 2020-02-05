public class Quiz109_Hap {
	public static void main(String[] args) {
/*		
		1~10, 11~20 ... 91~100 까지 합
*/		
		int sum;
		
		for(int i=1; i<=10; i++) {
			sum=0;
			for(int j=(i-1)*10+1; j<=i*10; j++) {
				sum+=j;
			}
			System.out.printf("%2d ~ %3d 까지 합 : %d\n", 
					(i-1)*10+1, i*10, sum);
		}

/*
		int sum;
		
		for(int i=1; i<=100; i+=10) {
			sum=0;
			for(int j=i; j<=(i-1)+10; j++) {
				sum+=j;
			}
			System.out.printf("%2d ~ %3d 까지 합 : %d\n", 
					i, (i-1)+10, sum);
		}
*/
	}
}
