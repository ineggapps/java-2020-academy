public class Quiz108_Dice9 {
	public static void main(String[] args) {
/*		
		�� ���� �ֻ����� ���� �� �ֻ����� ���� ���� 9�� �Ǵ� ��츦 ��� ���
*/		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 9)
					System.out.println("[" + i + ", " + j + "]");
			}
		}
	}
}
