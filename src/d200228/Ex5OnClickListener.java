package d200228;

public class Ex5OnClickListener {
	public static void main(String[] args) {
		Button.OnClickListener listener = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ŭ��");
			}
		};

		listener.onClick();
	}
}

//��ø �������̽�
class Button {
	public interface OnClickListener {
		public void onClick();
	}
}
