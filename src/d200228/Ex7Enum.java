package d200228;

public class Ex7Enum {
	public static void main(String[] args) {
		System.out.println(City.SEOUL);
		//toString()�� �����ǵǾ� ���� ������ SEOUL�� ��µȴ�.
		System.out.println("���� �α�: "+ City.SEOUL);
		System.out.println("\n��ü ����Ʈ...");
		for(City c: City.values()) {
			//�������� Ŭ����ó�� ������ �����ϰ� getter�� ���� �޼��带 �����Ͽ� Ȱ���� �� �ְڱ���!
			System.out.println(c.getName()+": "+c.getCount());
		}
	}
}

enum City {
	// ����� �� �Ҵ�: �����ڸ� �ۼ��ؾ� ������ ���� ����.
	SEOUL("����", 1000), BUSAN("�λ�", 350), DAEGU("�뱸", 250);

	private String name;
	private int count;

	// �����ڴ� private�� ����(private �����ص� private���� ����ȴ�)
	private City(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return this.name + "�α��� " + count + "�� ���Դϴ�.";
	}

}