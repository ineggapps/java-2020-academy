package d200204;

import java.util.Scanner;

public class WhileQuizHard7 {
	//���� ������ �Է� �޾� �Է� ���� ������ ������ ����ϴ� ���α׷� �ۼ��ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,reverse=0;
		int tmp=1,size=0,cnt=0,down=1, up=1;
		do {			
			System.out.print("��? ");
			num = sc.nextInt();
		}while(num<0);
		
		//124�� ���� �� 421�� ��µǵ��� �ϴ� �͸� ����
		//cnt�� �ڸ��� �ű��
		tmp=num;
		while(tmp!=0) {
			tmp/=10;
			size++; //���̸� �߰��� ������ 1�� ����
		}
		//�ڸ���-1�� 10�� ������
//		System.out.println("�Է� ���� ���� 10�� ������ "+(size-1));
		
		//�ڸ���-1�� ���� �����
		cnt=size-1;
		tmp=num;
		while(cnt>0) {
			cnt--;
			down*=10;
		}
		
		//124�� ��� down=100�� ��
		//up=1���� ���� (10�� �����Ͽ� ����)
		cnt=size;
		tmp=num;
		while(cnt>0) {//3ȸ �ݺ� (cnt=3, 2, 1) �׸��� 0�� �� �� ���Ǻ� �� ����
			cnt--;//�Ʒ��� ���������� 2 , 1, 0���� Ȱ���ϸ� �ȴ�.
			reverse+=(tmp/down) * up ;
//			System.out.println((tmp/down) * up);
//			System.out.println("tmp��: "+tmp);
//			System.out.printf("((%d/%d)*%d)*%d=%d%n",tmp,down,up,down,((tmp/down) * up )*down);
			tmp-= (tmp/down )*down;
//			System.out.println("tmp��: "+tmp);
//			System.out.printf("reverse=%d\t tmp=%d\t down=%d\t up=%d%n",reverse,tmp, down,up);
			down/=10;
			up*=10;
//			System.out.println("===");
		}
		
		//�ڸ����� ������ ���ϰ� ���ϸ鼭 ���� ������
//		cnt=size;
//		tmp=num;
//		while(cnt>0) {
////			System.out.println(size-cnt+","+cnt);// size-cnt: 0 1 2 / cnt: 3 2 1
//			reverse += tmp/(10*(cnt-1)) * 10*(size-cnt);
//			System.out.printf("tmp=%d cnt=%d ��=%d\n",tmp, cnt, (tmp/(10*(cnt-1))));
//			System.out.printf("reverse: %d / tmp/(cnt-1)=%d\n",reverse,tmp/(cnt-1));
//			tmp %=(cnt-1);
//			System.out.printf("tmp: %d%n",tmp);
//			cnt--;		
//		}
		
		System.out.printf("������ ��: %d%n",num);
		System.out.printf("������ ��: %d%n",reverse);
		sc.close();
	}
}
