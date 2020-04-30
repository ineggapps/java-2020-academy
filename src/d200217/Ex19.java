package d200217;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
//		Lotto l = new Lotto();
//		l.buy();
		new Lotto().buy();
	}
}

class Lotto {
	private Scanner sc = new Scanner(System.in);
	private int[] num;

	public Lotto() {
		num = new int[6];
	}

	private void lottoNum() {
		Random rnd = new Random();
		for (int i = 0; i < 6; i++) {
			num[i] = rnd.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		sorting();
	}

	private void write() {
		for (int n : num) {
			System.out.print(n + "\t");
		}
		System.out.println();
	}

	private void sorting() {
		Arrays.sort(num);
	}
	
	public void buy() {
		int n;
		do {
			System.out.print("구매 개수[1~5] ? ");
			n = sc.nextInt();
		}while(n<1 || n>5);
		
		for(int i=1;i<=n;i++) {
			lottoNum();
			System.out.print(i+"번째: ");
			write();
		}
		
	}

}
