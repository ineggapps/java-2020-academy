package d200218;

import java.text.ChoiceFormat;

public class Ex6 {
	public static void main(String[] args) {
		// ���� �ͺ��� ū ������� �Է�
		//If the limit array is not in ascending order, the results of formatting will be incorrect.
		// s�� g���� ����, ������ ���� ���ƾ� �Ѵ�.
//		double[] s = { 60, 70, 80, 90 };
//		String[] g = { "D", "C", "B", "A" };
		//���� �迭��� �����ϸ� 50���� D�� ���´�.
		double[] s = { 0, 60, 70, 80, 90 };
		String[] g = { "F", "D", "C", "B", "A" };
		//���� �迭��� �����ϸ� 50���� F�� ���´�.
		int[] scores = { 100, 95, 88, 80, 52, 60, 70 };
		ChoiceFormat f = new ChoiceFormat(s, g);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ": " + f.format(scores[i]));
		}
	}
}
