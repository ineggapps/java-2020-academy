package d200204;

public class WhileQuizBasic8 {
	public static void main(String[] args) {
		int n=0,s=0,ss=0;
		//n: 20��° �ױ��� �ݺ����� �����Ű�� ���� ����
		
		/*
		��������: 		1		2		4		7		11
		��������:		0		1		2		3		4
		
		 IDEA: 
		���������� 4�� 1(���������� ù ��) + 0+1+2 (���������� 1~3��) �̴�.
		 * */
		while(n<20) {
			s+=n++; //(���������� ���� ���ϱ�)
			ss+=1+s;
		}
		System.out.println("���: "+ss);
	}
	/*
	 *
	������ ��� TODO: ����� �� ����
	int n,s,t;
	 n=0; s=0;
	 t=1;
	 while(n<20){
	 	s+=t;
	 	n++;
	 	t+=n;
	 }
	 ��� s���
	 * */
}
