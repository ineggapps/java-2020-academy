public class Ex009_InfiniteLoop {
	public static void main(String[] args) {
/*
		1~10������ ������ ���� ����ϴ� ���α׷�(���� ����, infinite loop)
*/	
		int s=0, n=0;
		for(; ;) {
			n++;
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println("�� : "+s);

/*		
		int s=0;
		for(int n=1; ;n++) {
			s+=n;
			if(n>=10)
				break;
		}
		System.out.println("��:"+s);
*/		
	}
}
