
public class Ex010_forfloat {
	public static void main(String[] args) {
/*
     for ���� float �� ���������� ����� ��
     for �������� ���� float�� ���������� ������� �ʴ´�.
 */
		int start = 2000000000;
		int count = 0;
		for (float f = start; f < start + 50; f++) {
			count++;
		}

		// �Ʒ��� ����� �� �ϱ� ? 50?
		System.out.println(count); // 0
		
/*
    - ����Ȯ�� �ε��Ҽ��� ������ ���
       double total = 0;
       total += 4.7;
       total += .4;
       System.out.println(total); // 5.1000000000000005
      	     
	 - int ���� 2,000,000,000�� 2,000,000,050�� �и� �ٸ� �������� �� ���� float ������ ��ȯ�ϸ� ���� ���� ���� �ȴ�.
	   int value1 = 2_000_000_000;
	   int value2 = 2_000_000_050;

	   float fValue1 = 2_000_000_000;
	   float fValue2 = 2_000_000_050;

	   // int ���� value1�� value2�� �ٸ� ���̴�.
	   System.out.println("int �� " + value1 + "�� "+ value2 +"�� " + (value1 == value2 ? "����" : "�ٸ���"));

	   // float ���� fValue1�� fValue2�� ���� ���̴�.
	   System.out.println("float �� " + fValue1 + "�� "+ fValue2 +"�� " + (fValue1 == fValue2 ? "����" : "�ٸ���"));
	   // �� �� ��� float������ 2.0E9     
*/		
	}
}
