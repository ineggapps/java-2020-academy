package d200214;

public class Ex4 {
	public static void main(String[] args) {
		String s = "seoul korea";
		System.out.println(s);

		// ���ڿ� ����
		System.out.println("����: " + s.length());

		// �ε����� 0���� ����
		System.out.println(s.substring(6, 9));
		// substring(S,e): s�ε������� "e-1"�ε�������
		// s<=e�̰� e<=length()�̾�� �Ѵ�.
		System.out.println(s.substring(6));
		// substring(S): s�ε������� ������

		char c = s.charAt(6); // �ش� �ε����� ����
		System.out.println(c);
		System.out.println("===���ڿ� equal, equalsIgnoreCase ��===");
		System.out.println(s.equals("seoul korea"));// true ���ڿ� �񱳰��
		System.out.println(s.equals("Seoul KOREA"));// false (��ҹ��� �����Ѵ�)
		System.out.println(s.equalsIgnoreCase("Seoul KOREA"));// true (��ҹ��� ���� ����)

		// ���ڿ��� "seoul"�� ���� ���� startsWith�� ��ҹ��� �����Ѵ�.
		System.out.println(s.startsWith("seoul"));
		// ���ڿ��� "korea"�� �������� ����
		System.out.println(s.endsWith("korea"));

		// "seoul korea"�� "seoul corea"�� ���� �� Ŭ��?
		// ������ �迭(ASCII �ڵ� ����)
		// �� ���ڿ� �� �� compareTo
		System.out.println(s.compareTo("seoul corea"));// k-c =8 (c���� 8ĭ �̵��ؾ� k�̴�.)
		// ���ڿ��� >, <, ==�� ���� �����ڷδ� ���� �� ����.

		// "kor"�� ��ġ�� ���?
		System.out.println(s.indexOf("kor"));// ��ġ�� �����ϴ� index����
		System.out.println(s.indexOf("busan"));// ������ -1�� ��ȯ�Ѵ�.

		// ó������ ã�´�
		System.out.println(s.indexOf("o"));
		// �ε��� 3���� ã�´�.
		System.out.println(s.indexOf("o", 3));
		// �ڿ������� ã�´�.
		System.out.println(s.lastIndexOf("o"));

		s = "�츮���� ���ѹα� ���ѵ��� ���� ������ �Ǿ�";
		s = s.replaceAll("����", "����");// String�� �Һ��̹Ƿ� ���Կ����ڷ� ��򰡿� ����� ������߰���?
		// replace�޼���� ����ǥ������ ����� �� ����, replaceAll�� ����ǥ������ ����� �� �ִ�.
		System.out.println(s);

		s = "�츮123���� ����65�α�";
		s = s.replaceAll("\\d", "");// \\d: ���ڸ� �ǹ� (�������ô� java���� \ escape character���ν��ϹǷ� �� �� �� �����Ͽ� \\�� �ۼ�)
		System.out.println(s);

		s = "�ڹ� 123 ������ 345 HTML";
		s = s.replaceAll("[0-9]","");//���� ���ֱ�
		System.out.println(s);

		s = "�ڹ� 123 ������ 345 HTML";
		s = s.replaceAll("\\w|\\s","");//���� �� ���� ���ֱ�
		System.out.println(s);

		s = "�ڹ� 123 ������ 345 HTML";
		s = s.replaceAll("[^0-09]","");//���� ���ֱ�
		System.out.println(s);
		
		//���ڿ��� �������� �и��Ͽ� �迭�� ��ȯ�Ѵ�.
		//split �޼��忡���� ���Խ����� ǥ���� �� �ִ�.
		String[] ss="java,html,css".split(",");
		for(String a: ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(String a: ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		String[] ss2= "010-1234-1234".split("-");
		for(String a: ss2) {
			System.out.print(a);
		}
		System.out.println();
	}
}