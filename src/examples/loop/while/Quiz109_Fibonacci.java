public class Quiz109_Fibonacci {
	public static void main(String[] args) {
/*		
		�Ǻ���ġ���� 1+1+2+3+5+8+13+21 ��
*/
		int a=1, b=1, c;
        int s=2;
        
        int n=2;
        while(n<8) {
            c=a+b;
            s=s+c;
            a=b;
            b=c;
            n++;
        }
        System.out.println("��� : "+s); // 54
	}
}
