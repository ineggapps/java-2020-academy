package d200204;

public class ForTest10 {
public static void main(String[] args) {
	int count=0;
	int s=2000000000;
	
		/* �� �ڷ��� ����
		 * ������ �� 20�� �ڿ��� �߷�������.
		 * (�ڷ��� ����)
		 * float a=2000000000; 
		 * float b=2000000000+50; 
		 * System.out.println(a==b); 
		 * 20��50�� float���� �����ϸ� 20���̴�. 
		 * ���е��� ���� ������...
		 */ 
	
	/*CAUTION: float�� ��ü�� ���е� ǥ���� ���� ������ �ݺ����� ����ϸ� �ǵ��� ����� ������ ���� �� ����.*/
	//�ǵ����̸� float���� ����� �����Ѵ�.
	for(float f=s;f<s+50;f++) {
		count++;
	}
	System.out.println(count);//0
	
	for(int f=s;f<s+50;f++) {
		count++;
	}
	System.out.println(count);//50
	
	
}
}
