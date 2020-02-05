import java.util.Scanner;

public class Quiz205_Money {
	public static void main(String[] args) {
/*		
		금액을 입력 받아 화폐별 매수를 반복문을 이용하여 작성
*/		
		Scanner sc=new Scanner(System.in);

        int uint = 50000; // 화폐단위 : 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
        int num = 0; // 화폐 매수
        boolean sw = false;

        int money;
		System.out.print("금액 ? ");
		money=sc.nextInt();
		
        while (true) {
            num = money / uint;
            System.out.println(uint + "원권/개수 : " + num);

            if (uint <= 1) {
                break;
            }
            
            money = money - uint * num; // 나머지 금액
            
            if(sw) { // 화폐의 다음 단위
                uint /= 2;
			} else {
                uint /= 5; 
            }
            
			sw = !sw;
        }
        
        sc.close();
	}
}
