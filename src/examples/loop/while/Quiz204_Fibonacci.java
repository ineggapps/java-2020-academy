import java.util.Scanner;

public class Quiz204_Fibonacci {
	public static void main(String[] args) {
/*		
		0���� �Է� ���� ������ŭ�� �Ǻ���ġ������ ���
*/		
		Scanner sc=new Scanner(System.in);
        int a, b, c, n;
        int cnt;
        
        System.out.print("���� ? ");
        cnt = sc.nextInt();
        
        n=0;   a=0;   b=1;
        while(n<cnt) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            n++;
        }
        
        sc.close();
	}
}
