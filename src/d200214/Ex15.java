package d200214;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println("����Ʈ ĳ���ͼ�: " + System.getProperty("file.encoding"));// MS949 ���ڵ� ��� ȯ�濡���� MS949���
																				// ��µ�(��euc-kr)
		try {
			byte[] b;
			String s = "���ѹα�"; // ����Ʈ ĳ���ͼ��� MS949�� ����ȴ�.
			b = s.getBytes();
			System.out.println("����: " + b.length);
			for (byte a : b) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("===================");

			b = s.getBytes("utf-8");
			System.out.println("utf-8�� ����: " + b.length);
			for (byte a : b) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("===================");
		} catch (Exception e) {
		}
	}
}
