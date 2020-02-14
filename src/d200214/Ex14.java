package d200214;

import java.util.StringTokenizer;

public class Ex14 {
	public static void main(String[] args) {
		String s = "java,css,html";
		
		String[] ss=s.split(",");
		for(String a:ss) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		//������ ������ String�� split����� ��� StringTokenizer�� ����߾�� �ߴ�.
		//String split����� ����� �� �ִٸ� StringTokenizerŬ���� ����� �������� �ʴ´�.
		//�� String�� split�� ���Խ����� �߶� �� ����.
		StringTokenizer st = new StringTokenizer(s,",");
		String x;
		while(st.hasMoreTokens()) {//�и��� ���ڿ��� �ִٸ�?
			x=st.nextToken();//���� ���ڿ� ,�� �ڸ� ���ڿ��� ������� �ѱ��
			System.out.print(x+" ");
		}
		System.out.println();

		
		StringTokenizer st2 = new StringTokenizer(s,",",true);//boolean returnDelims�� true�� �����ڵ� �ԷµǾ� ��ȯ�� �Ѵ�
		String x2;
		while(st2.hasMoreTokens()) {//�и��� ���ڿ��� �ִٸ�?
			x2=st2.nextToken();//���� ���ڿ� ,�� �ڸ� ���ڿ��� ������� �ѱ��
			System.out.print(x2);
		}
		System.out.println();
		
		
	}
}
