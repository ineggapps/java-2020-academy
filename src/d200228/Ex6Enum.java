package d200228;

public class Ex6Enum {
	public static void main(String[] args) {
		Test6 t = new Test6();
//		if(t.getColor()==1) {} ������ ���� �񱳴� �Ұ����ϴ�.
		Color color = t.getColor();
		System.out.println(t);
		switch (color) {
		case RED:
			System.out.println("red...");
			break;
		case GREEN:
			System.out.println("green...");
			break;
		case BLUE:
			System.out.println("blue...");
			break;
		}
		for (Color c : Color.values()) {
			// ���� for������ Color ������ �������� ��� ��ȸ�� ������.
			System.out.println(c + "�� ����(���): " + c.ordinal());
		}

	}
}

//������ ���� ����
enum Color {
	RED, GREEN, BLUE, BLACK, VIOLET, LIME, ORANGE
}

class Test6 {
	private Color color = Color.RED;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}