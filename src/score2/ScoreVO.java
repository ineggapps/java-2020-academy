package score2;

public class ScoreVO {
//	한 줄에 한 필드만 선언하는 것이 원칙임.
	private String hak;
	private String name;
//	private int kor, eng, mat; << 한 줄 선언 권장하지 않음
	private int kor;
	private int eng;
	private int mat;

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		int tot;
		if (hak == null || name == null)
			return null;
		tot = kor + eng + mat;

		return "[hak=" + hak + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + "]";
	}
}
