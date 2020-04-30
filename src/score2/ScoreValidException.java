package score2;

public class ScoreValidException extends Exception {
	private static final long serialVersionUID = 2L;

	public ScoreValidException() {
		this("ScoreValidException");
	}

	public ScoreValidException(String msg) {
		super(msg);
	}

}
