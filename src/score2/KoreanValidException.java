package score2;

public class KoreanValidException extends Exception {
	private static final long serialVersionUID = 1L;

	public KoreanValidException() {
		this("KoreaValidException");
	}

	public KoreanValidException(String msg) {
		super(msg);
	}
}
