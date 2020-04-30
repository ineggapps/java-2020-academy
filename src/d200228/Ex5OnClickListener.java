package d200228;

public class Ex5OnClickListener {
	public static void main(String[] args) {
		Button.OnClickListener listener = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("클릭");
			}
		};

		listener.onClick();
	}
}

//중첩 인터페이스
class Button {
	public interface OnClickListener {
		public void onClick();
	}
}
