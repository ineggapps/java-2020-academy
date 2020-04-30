package d200218;

import java.text.ChoiceFormat;

public class Ex6 {
	public static void main(String[] args) {
		// 낮은 것부터 큰 순서대로 입력
		//If the limit array is not in ascending order, the results of formatting will be incorrect.
		// s와 g간의 순서, 개수가 서로 같아야 한다.
//		double[] s = { 60, 70, 80, 90 };
//		String[] g = { "D", "C", "B", "A" };
		//위의 배열대로 설정하면 50점이 D가 나온다.
		double[] s = { 0, 60, 70, 80, 90 };
		String[] g = { "F", "D", "C", "B", "A" };
		//위의 배열대로 설정하면 50점이 F가 나온다.
		int[] scores = { 100, 95, 88, 80, 52, 60, 70 };
		ChoiceFormat f = new ChoiceFormat(s, g);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ": " + f.format(scores[i]));
		}
	}
}
