public class Quiz108_Dice9 {
	public static void main(String[] args) {
/*		
		두 개의 주사위를 던져 두 주사위의 눈의 합이 9가 되는 경우를 모두 출력
*/		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 9)
					System.out.println("[" + i + ", " + j + "]");
			}
		}
	}
}
