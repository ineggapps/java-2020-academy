package d200129;

public class PrintfEx1 {
	public static void main(String[] args) {
		System.out.printf("%(d\n",123);//����� �� �Ϲ����� ���
		System.out.printf("%(d\n",-123);//������ �� (����) �������� ��� �� ȸ�迡�� ()�� ������ ǥ���ϴ� ��찡 �־
		System.out.printf("%d\n",(int)'A');
		System.out.println("========================");
		System.out.printf("%% %d\n",0);//%���ڴ� %%�� �Է�
		System.out.printf("%f\n",123.23);//�Ҽ��� �⺻ 6�ڸ� ���
		System.out.printf("%f\n",12345e-03);
		System.out.printf("%.2f\n",123.236);//�Ҽ��� 3��° �ڸ����� �ݿø��Ͽ� 2�ڸ��� ��Ÿ��
		System.out.printf("%8.2f\n",123.24);//��ü �ڸ� 8�ڸ� ������ �Ҽ��ڸ��� 2�ڸ��� ���. ('.'�� ������ ������)
		System.out.printf("%4.2f\n",123.24);//���� �ڸ��� ��ĥ ���� �����ϰ� ����Ѵ�.
		
		System.out.printf("%10.5g\n",123.456);//10ĭ�� ���������� ���ڴ� 5�ڸ��� ����Ͽ���. (���ڸ� �߶�� �ϹǷ� �Ҽ������� �ݿø���)
		System.out.printf("%10.3g\n",123.556);//10ĭ�� ���������� ���ڴ� 5�ڸ��� ����Ͽ���. (���ڸ� �߶�� �ϹǷ� �Ҽ������� �ݿø���)
		System.out.printf("%10.2g\n",123.456);//10ĭ�� ���������� ���ڴ� 2�ڸ��� ǥ���� �� �����Ƿ� ���������� ǥ���� Ne+00 (N��0)
		//=> �տ��� �� �ڸ��� ���ڸ� �߶� ���� ���·� ǥ���Ͽ���[1.2]e+02
		
		System.out.printf("%10.3e\n",123.456);//�����κ��� 0�� �ƴ� ������ �;� �Ѵ�.
		System.out.printf("%10.4e\n",4584.2246);
		
		System.out.printf("%b\n",true);//%b�� boolean���
		System.out.printf("%x\t",437);
		System.out.printf("%#x\n",437);
		System.out.printf("%X\t",437);
		System.out.printf("%#X\n",437);
		
		System.out.printf("%10.3s\n","Korea");
		System.out.printf("%10.3S\n","Korea");
		
		System.out.printf("%,d\n",1234567);
		System.out.printf("%(,d\n",1234567);
		System.out.printf("%(,.2f\n",1234567.557);
		
		System.out.printf("%d %d %d %d\n", 10,5,10,10);
		System.out.printf("%1$d %2$d %1$d %1$d\n", 10,5);//%1$d=(ù ��° �μ��� ��), %2$d=(�� ��° �μ��� ��)
		/*
			Error �� ����
			1. �����Ͽ���: ���� ���� - �������� �� �˻��ϱ�
			2. ��Ÿ�ӿ���: ������ �� �߻��ϴ� ����, ��Ÿ�� ������ �߻��ϸ� ���α׷� ������ ������.
		*/
	}
}
