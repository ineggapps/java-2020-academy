import java.util.Scanner;

public class Quiz205_Money {
	public static void main(String[] args) {
/*		
		�ݾ��� �Է� �޾� ȭ�� �ż��� �ݺ����� �̿��Ͽ� �ۼ�
*/		
		Scanner sc=new Scanner(System.in);

        int uint = 50000; // ȭ����� : 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
        int num = 0; // ȭ�� �ż�
        boolean sw = false;

        int money;
		System.out.print("�ݾ� ? ");
		money=sc.nextInt();
		
        while (true) {
            num = money / uint;
            System.out.println(uint + "����/���� : " + num);

            if (uint <= 1) {
                break;
            }
            
            money = money - uint * num; // ������ �ݾ�
            
            if(sw) { // ȭ���� ���� ����
                uint /= 2;
			} else {
                uint /= 5; 
            }
            
			sw = !sw;
        }
        
        sc.close();
	}
}
