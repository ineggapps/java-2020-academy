package d200206;

public class ArraryEx3 {
	public static void main(String[] args) {
		//���ڹ��� �迭�� ��ü�̴�!
		//review: �⺻ �ڷ���(primitive type), ���� �ڷ���(reference type) �� �ִ�.
		//�迭�� �����ڷ����̴�. ("�迭", Ŭ����, �������̽�, ��)
		int []score=new int[5];//int�� ������ �ƴ϶� ������ �����̴�.
		//new: �޸𸮸� ��� ������
		//score �迭�� �̸��� �ش� ������ ���� �ּҶ�� �����ϸ� �ȴ�.
		//new int[5]��� ������ ��ǻ�ʹ� �����ġ�� �������� ������ �Ҵ��Ͽ� �޸� �ּ��� ��ġ�� ����Ű���� �Ѵ�.
		//���������� ������ ����Ű�Ƿ� �޸𸮿��� �迭�� ���� ù �ּ��� ��ġ�� score�� �Է��Ͽ� �ش�.
		//�� C����� ������ ����� ���������� JAVA������ �����ʹ� JVM�� ������ �����ϴ�.
		//�� JAVA������ �޸� �ּҸ� ����ڰ� ���� ������ �� ���� ������ �޸𸮸� ���� ������ �ʿ䵵 ����.
		//=> Garbage Collector�� ������� �ʴ� �޸� �ּҸ� �ľ��Ͽ� �ڵ����� �����Ѵ�.
		int tot, ave;
		
		
		//����, ��
//		int a; // ���� �޸� ������ �����Ѵ�
//		int b[]; //�� �޸� ������ �����Ѵ�.
		
		score[0]=60;
		score[1]=70;
		score[2]=80;
		score[3]=70;
		score[4]=80;
		
//		score = new int[6];//������ ������ Ȯ���� ���� ����, new int[6]�� ���� �����ϰ� �Ǹ� ���ο� ������ �Ҵ�ȴ�.
		//������ �Ҵ���� ������ JVM�� ���� ���ŵ�.
		
		//[÷��] << ÷�� ������ byte, short, char, int�� ���� (long �Ұ���)
		tot=0;
		for(int i=0;i<score.length;i++) {
			tot+=score[i];
		}
		ave=tot/score.length;
		
		System.out.printf("�հ�: %d, ���: %d%n",tot,ave);
		System.out.println(score);//==Hashcode (�ϴ��� �迭�� �ּҸ� ����� �شٰ� ��������)
	}
}