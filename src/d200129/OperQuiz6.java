package d200129;

import java.util.Scanner;
/*
 * ü�߰� Ű�� �Է� �޾� BMI(ü��������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * [ó������]
 * - ü���� �Է� ������ kg�̸� �Է��� Scanner Ŭ������ nextDouble() �޼��带 �̿��Ͽ� �Ǽ��� �Է� �޴´�.
 * - Ű�� �Է� ������ cm�̸� �Է��� Scanner Ŭ������ nextDouble() �޼��带 �̿��Ͽ� �Ǽ��� �Է� �޴´�.
 * - ü���� kg, Ű�� m ������ ����ϸ� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� �� �ڸ��� ����Ѵ�.
 * - BMI ����� �Ҽ��� �� ° �ڸ����� ���Ͽ� �Ҽ��� �� �ڸ��� ����Ѵ�.
 * [���� ����]
 * - BMI(ü��������, Body Mass Index)
 * BMI�� ������ ����� ü���� �̿��Ͽ� ������ ���� �����ϴ� �������� ü����� �� �ǰ� ���赵�� �ݿ��ϴ� ��ǥ��� �� �� �ִ�. 
 * ������ BMI�� ����� ü�߸��� �̿��Ͽ� ���ǹǷ� ����� ���� ü���������� ������ ü������� �ٸ� �� �ִ�.
 * BMI = ü�� / (Ű*Ű)
 * ü�� ������ kg�̸� Ű�� m�̴�.
 * ���� ��� ü���� 80kg�̰� Ű�� 183cm(1.83m)�̸�
 * BMI = 80 / (1.83 * 1.83) = 23.9�̴�.
 * - BMI�� ���� ü�� ����
 * 18.5����: ��ü��
 * 18.5 ~ 24.9: ����
 * 25.0 ~ 29.9: ��ü��
 * 30.0 �̻�: ��
 * */
public class OperQuiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight, height, heightM, bmi;
		System.out.print("ü��(kg) ? ");
		weight = sc.nextDouble();
		System.out.print("Ű(cm) ? ");
		height = sc.nextDouble();
		
		heightM = height*0.01;
		bmi = weight / (heightM * heightM);
		
		//�ᱣ��
		System.out.printf("������: %.2fkg\n",weight);
		System.out.printf("Ű: %.2fm\n",height*0.01);
		System.out.printf("BMI: %.1f\n",bmi);
		sc.close();	
	}
}
