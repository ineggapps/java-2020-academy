package d200205;

public class ForQuizHard4Answer {
	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {//Ȧ���� ��
				s+=i;
				System.out.print(i+" - ");
			}
			else {//¦���� ��
				s-=i;
				System.out.print(i+(i==10?" = ":" + "));
			}
		}
		System.out.println(s);
	}
}
