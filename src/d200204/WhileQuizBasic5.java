package d200204;

public class WhileQuizBasic5 {
	//1+2+3+...+n������ ���� 100�� �Ѵ� �ּ��� n�� �׶��� ���� ���ϴ� ���α׷�
	public static void main(String[] args) {
		int n=0,sum=0;
		while(sum<=100) {//"�ε�ȣ���� =�� �ִ� �� �¾ƿ�~" (100�� �Ѵ�.. �̶�� �ʰ��Ѵٴ� �ǹ̶� <�� ���� �� ������...)
			n++;
			sum+=n;
		}
		System.out.println("�ּ��� n: "+n);
		System.out.println("��: "+sum);
	}
}
