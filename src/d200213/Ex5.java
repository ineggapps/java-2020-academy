package d200213;

public class Ex5 {
	public static void main(String[] args) {
		//���������� JDK5.0����
		//cf) C���� ó������ ����
		int s;
		Test5 t = new Test5();
//		s = t.sum(new int[] {1,2,3,10,10,10});//�迭�� �Ѿ��!
		s = t.sum(1,2,3,10,10,10);
		System.out.println(s);
		s = t.sum(1,2,3,10,10,10,90,10,100);//��.. ������ ������ �޶� �󸶵��� �ᱣ���� ����� �ǳ�!
		System.out.println(s);
	}
}

class Test5 {
	public int sum(int... n) {
		/*
		 	JAVA�� �������� �� int... < ���������ڸ� �迭�� ��ġ�� ������ ��ģ��.
		 	�׷��� �Ʒ��� �������� �迭�� ����Ͽ� ������ ������ ���̴�!
		 */
		int s = 0;
		for (int i : n) {
			s += i;
		}
//		for(int i=0;i<n.length;i++) {
//			s+=n[i];
//		}
		return s;
	}
}
