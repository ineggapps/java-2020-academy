public class Ex002_switch {
	public static void main(String[] args) {
/*
		13�� 3�� ������� Ȯ���ϴ� ���α׷�
*/
		int n=13;
		switch(n%3) {
		case 0: System.out.println(n+" : 3�� ���"); break;
		case 1: case 2: System.out.println(n+" : 3�� ����� �ƴ�"); break;
		}
	}
}
