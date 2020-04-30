package d200203;

public class RandomEx {
	public static void main(String[] args) {
		//0≤n＜1 사이의 결괏값을 출력한다.
		System.out.println(Math.random());
		//0*3≤n*3＜1*3
		//0≤n*3＜3 (단, n*3은 3 이상의 값이 되지 않는다.)
		//ex: 0.999999라는 난수에 3을 곱해도 2.999997이 나오므로 3 이상의 값이 되지 않는다.
		//∴ 0+1≤n*3＜3+1
		//1≤n*3＜4의 범위 내에서만 난수가 발생한다.
		System.out.println((int)(Math.random()*3)+1);
	}
}
