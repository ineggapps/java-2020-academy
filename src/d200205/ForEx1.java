package d200205;

public class ForEx1 {
	public static void main(String[] args) {
		//����for�� ����
		for(int i=1;i<=3;i++) {
			System.out.println("i:"+i);//3�� ����
			for(int j=1;j<=2;j++) {
				System.out.println("i:"+i+", j:"+j);//i�� 3�� X j�� 2���� = ���� �� �� 6�� �����
			}
			System.out.println("----------------------");//3�� ����
		}
	}
}
