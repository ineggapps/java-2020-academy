package d200205;

public class RandomEx {
	public static void main(String[] args) {
		int n;
		for(int i=1;i<=100;i++) {
			/* 
			 * Math.random()은 0부터 1미만의 실수를 발생시킴.
			 * 범위는 0에서 0.999999999999999999…까지이다.
			 * 0 			<= Math.random() 		< 1 사이의 난수 발생
			 * 0*100 <= Math.random()*100 < 100 사이의 난수 발생
			 * 0+1    <= Math.random()*100+1 < 100+1
			 ∴ 1         <= Math.random()*100+1 < 101
			*/
			n = (int)(Math.random()*100)+1;
			System.out.printf("%5d\t",n);
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
