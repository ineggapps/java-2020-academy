package d200214;

public class Ex9 {
	public static void print(String[] ss) {
		for (String s : ss) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	public static void sort(String[] ss) {
		int pass;
		boolean flag;
		String temp;
		// compareTo를 이용한 버블정렬 예제
		pass = 1;
		do {
			flag = false;
			for (int i = 0; i < ss.length - pass; i++) {
//				if(ss[i].compareTo(ss[i+1])>0) {//오름차순
				if (ss[i].compareTo(ss[i + 1]) < 0) {// 내림차순 (비교하여 음수가 나온 경우 내림)
					temp = ss[i];
					ss[i] = ss[i + 1];
					ss[i + 1] = temp;
					flag = true;
				}
			}
			pass++;
		} while (flag);
	}

	public static void main(String[] args) {
		String[] ss = { "서울", "부산", "대구", "광주", "대전" };

		System.out.print("sort 전: ");
		print(ss);

		sort(ss);

		System.out.print("sort 후: ");
		print(ss);
	}
}