package d200214;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println("디폴트 캐릭터셋: " + System.getProperty("file.encoding"));// MS949 인코딩 방식 환경에서는 MS949라고
																				// 출력됨(≒euc-kr)
		try {
			byte[] b;
			String s = "대한민국"; // 디폴트 캐릭터셋인 MS949로 저장된다.
			b = s.getBytes();
			System.out.println("길이: " + b.length);
			for (byte a : b) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("===================");

			b = s.getBytes("utf-8");
			System.out.println("utf-8의 길이: " + b.length);
			for (byte a : b) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("===================");
		} catch (Exception e) {
		}
	}
}
