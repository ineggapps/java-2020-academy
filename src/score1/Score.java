package score1;

public class Score {
	public int getTot(int[] s) {
		int result = 0;
		for (int i = 0; i < s.length; i++) {
			result += s[i];
		}
		return result;
	}

	public int getAve(int[] s) {
		// 음~~~ 중복 코드의 제거
		return getTot(s) / s.length;
	}

	public double getGrade(int s) {
		double result = 0;
		if (s >= 95) {// if(s>=95 && s<=100) 에서 점수가 오류가 없다고 가정하였으므로 s<=100의 조건식은 작성하지 않는다
			result = 4.5;
		} else if (s >= 90) {
			result = 4.0;
		} else if (s >= 85) {
			result = 3.5;
		} else if (s >= 80) {
			result = 3.0;
		} else if (s >= 75) {
			result = 2.5;
		} else if (s >= 70) {
			result = 2.0;
		} else if (s >= 65) {
			result = 1.5;
		} else if (s >= 60) {
			result = 1.0;
		}
		return result;
	}
}
