package d200204;

public class WhileQuizBasic2 {
	//1-2+3-4+...+9-10 (if�� ��� �ۼ��� �����ϴ�)
	public static void main(String[] args) {
		int n=0,s=0;
		while(n<10) {
			//�ݺ����� n������ 1���� �϶�� ���� ����.
			n++;
			s+=n;
			n++;
			s-=n;
		}
		System.out.println("��: "+s);
	}
}
