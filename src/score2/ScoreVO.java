package score2;

public class ScoreVO {
//	�� �ٿ� �� �ʵ常 �����ϴ� ���� ��Ģ��.
	private String hak;
	private String name;
//	private int kor, eng, mat; << �� �� ���� �������� ����
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
