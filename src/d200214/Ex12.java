package d200214;

public class Ex12 {
	/**
	 * StringBuffer, StringBuilder : �������� ���ڿ��� ó���ϴ� ��� String���� ���� 
	 * StringBuilder:����ȭ�� �������� ����. StringBuffer���� ���� 
	 * StringBuffer: ����ȭ ����. ��Ƽ �����忡�� ���� �� ���� ���ڿ��� ó���ϴ� ��쿡�� String�� �� ����
	 */
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1);
		System.out.println(sb1);
		System.out.println(sb1 == sb2);// �ּ� ��
		System.out.println(sb1.equals(sb2)); // �� false (�ּڰ��� ���ϱ� ����)
		// ���ڿ��� ���ϱ� ���ؼ��� String���� ��ȯ �� ������!
		System.out.println(sb1.toString().equals(sb1.toString()));// true
		System.out.println("����: " + sb1.length());// 5(korea)

		StringBuffer sb3 = new StringBuffer();
		System.out.println("�ʱ����ũ��:" + sb3.capacity());// 16

		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("���ѹα�");
		sb3.append("�츮����");
		sb3.append("�ڹ�");
		sb3.append("������");
		System.out.println("append �� ����ũ��:" + sb3.capacity());// ����: 34, ���� �� �ڵ����� �ø���.
		
		System.out.println(sb3);
		System.out.println(sb3.indexOf("�ڹ�"));

		String s2 = sb3.toString();
		System.out.println(s2.toUpperCase());
		
		//�� �տ� �ѱ� ���ڿ� ����
		sb3.insert(0, "�ѱ�");
		System.out.println(sb3.toString());
		
		//korea �տ� super ���ڿ� ����
		sb3.insert(sb3.indexOf("korea"),"super");
		System.out.println(sb3.toString());

		//korea �ڿ� ��� ���ڿ� ����
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"���");
		System.out.println(sb3.toString());
		
		//���ѹα� ���ڿ� �����
		sb3.delete(sb3.indexOf("���ѹα�"), sb3.indexOf("���ѹα�")+"���ѹα�".length()); //(end-1) �ε������� ����
		System.out.println(sb3.toString());
		
		//korea ���ڿ����� ������ �����
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3.toString());
		
		System.out.println("����:"+sb3.length()+", ���� ũ��: "+sb3.capacity());//���� ũ�� ������ 34
		sb3.trimToSize();//������ ũ�⸦ ���ڿ� ���̷� 
		System.out.println("����:"+sb3.length()+", ���� ũ��: "+sb3.capacity());//���� ũ�� ���̸� ���ڿ��� ���̸�ŭ�� ����
		
		System.out.println("��"+sb1+"��");
		sb1.delete(0, sb1.length());
		System.out.println("��"+sb1+"��");
		
		//��ü ���� ���빰�� ����� ȿ���� ���� �ٸ� ���
		System.out.println("��"+sb2+"��");
		sb2 = new StringBuffer();
		//���ο� ��ü�� �����ϸ� ������ ���� ��ü�� �ּڰ��� �ƴ� ���� ������ ���� �ּڰ��� ����ų �״ϱ�.
		System.out.println("��"+sb2+"��");
	}
}
