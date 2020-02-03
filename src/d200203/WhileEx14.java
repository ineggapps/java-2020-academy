package d200203;

public class WhileEx14 {
	public static void main(String[] args) {
		int n=0,s=1;
		//1*2*3*...*9*10.
		while(n++<10){
			s*=n;
		}
		System.out.println("1~10ÀÇ °ö: "+s);
	}
}
