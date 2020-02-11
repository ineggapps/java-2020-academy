package d200211;

public class Ex7 {
	public static void main(String[] args) {
		Test7 tt = new Test7();
		int result;
		result = tt.sum(20);
		System.out.println("���:" + result);
		System.out.println("4�� ¦��? " + tt.isEven(4));
		char c = 'g';
		System.out.println(c + "�� �빮�ڷ� ��ġ��? " + tt.upper(c));
		System.out.println(c + "�� �빮��? " + tt.isUpper(c));
		int a = 1, b = 10;
		result = tt.sum2(a, b);
		System.out.printf("%d���� %d������ ���� %d�Դϴ�.%n", a, b, result);
		tt.gugu(2);
		tt.gugu(17);
		int score = 88;
		System.out.println(score + "���� " + tt.grade(score) + "�Դϴ�.");
	}
}

class Test7 {
	public int sum(int n) {// n: �Ű�����(�Ķ����)
		// �Ű������� ���������� �����̶�� ���� �ȴ�.
		// �ڸŰ������� ���������� �����ϰ� ���� ������ ����ȴ�
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += n;
		}
		return s;
	}

	// �Ű������� ���޵� ������ ¦������ �Ǻ��ϴ� �޼���
	public boolean isEven(int n) {
		return (n & 1) == 0;
	}

	// �Ű������� ���� ���� ���� �� �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� �޼���
	public char upper(char ch) {
		return (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
	}

	// �Ű������� ���޵� ���ڰ� �빮������ �Ǻ�
	public boolean isUpper(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// �� ������ �Ű������� ���޹޾� ���� ������ ū ������ �� ���ϱ�
	public int sum2(int a, int b) {
		int t, s = 0;
		// a�� ���� ���� �ǵ��� �����ϱ�
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		for (int i = a; i <= b; i++) {
			s += i;
		}
		return s;
	}

	// �Ű������� �Է� �޾Ƽ� �ش��ϴ� ���� ������ǥ�� ���
	public void gugu(int dan) {
		if(dan<1 || dan>9){
			System.out.println("1~9�ܱ����� �Է��� �����մϴ�");
			return;
		}
		System.out.println(dan + "�� ���");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %2d%n", dan, i, dan * i);
		}
		return; // return type�� void���� ��쿡�� ������ �����ϴ�
		// return type�� void���� ��쿡�� �޼��带 ������ �� ȣ���� ������ ���ư���.
		// ���� �Ѱ��� ���� ���� ��쿡 void���� �̿��Ͽ� �޼��带 �ۼ��Ѵ�.
	}

	// �Ķ���ͷ� ���� ���� ������ �̿��Ͽ� ���� ���
	// ��, �Է¹��� ���������� ������ ���ٴ� ���� �Ͽ� �ۼ��Ѵ�.
	public double grade(int s) {
		double n;
		if (s >= 95) {// if(s>=95 && s<=100) ���� ������ ������ ���ٰ� �����Ͽ����Ƿ� s<=100�� ���ǽ��� �ۼ����� �ʴ´�
			n = 4.5;
		} else if (s >= 90) {
			n = 4.0;
		} else if (s >= 85) {
			n = 3.5;
		} else if (s >= 80) {
			n = 3.0;
		} else if (s >= 75) {
			n = 2.5;
		} else if (s >= 70) {
			n = 2.0;
		} else if (s >= 65) {
			n = 1.5;
		} else if (s >= 60) {
			n = 1.0;
		} else {
			n = 0;
		}
		return n;
	}
}