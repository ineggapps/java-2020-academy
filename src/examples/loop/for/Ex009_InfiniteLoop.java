public class Ex009_InfiniteLoop {
	public static void main(String[] args) {
/*
		1~10까지의 정수의 합을 출력하는 프로그램(무한 루프, infinite loop)
*/	
		int s=0, n=0;
		for(; ;) {
			n++;
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println("합 : "+s);

/*		
		int s=0;
		for(int n=1; ;n++) {
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println("합:"+s);
*/		
	}
}
