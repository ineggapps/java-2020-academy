import java.util.Scanner;

public class Quiz108_Score {
	public static void main(String[] args) {
/*
		����ó�� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		String hakbeon, name;
		int midterm, finals, absence, report;
		int midtermScore, finalsScore, attendScore, reportScore;
		int score;
		char grade;
		
		System.out.print("�й� ? ");
		hakbeon = sc.next();
		
		System.out.print("�̸� ? ");
		name = sc.next();
		
		System.out.print("�߰���� ���� ? ");
		midterm=sc.nextInt();

		System.out.print("�⸻��� ���� ? ");
		finals=sc.nextInt();

		System.out.print("�ἮȽ�� ? ");
		absence=sc.nextInt();

		System.out.print("����Ʈ ���� ? ");
		report=sc.nextInt();
		
		midtermScore = (int)(midterm * 0.4);
		finalsScore = (int)(finals * 0.4);
		if(absence>=6)
			attendScore=0;
		else if(absence>=4)
			attendScore=60;
		else if(absence>=2)
			attendScore=80;
		else
			attendScore=100;
		attendScore	= (int)(attendScore * 0.1);
		reportScore	= (int)(report * 0.1);
		
		score = midtermScore + finalsScore + attendScore + reportScore;
		
		if(score>=90)
			grade = 'A';
		else if(score>=80)
			grade = 'B';
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("\n�й�\t�̸�\t�߰����\t�⸻���\t�⼮����\t����Ʈ\t�ջ�����\t����");
		System.out.print(hakbeon+"\t");
		System.out.print(name+"\t");
		System.out.print(midtermScore+"\t");
		System.out.print(finalsScore+"\t");
		System.out.print(attendScore+"\t");
		System.out.print(reportScore+"\t");
		System.out.print(score+"\t");
		System.out.println(grade);
		
		sc.close();
	}
}
