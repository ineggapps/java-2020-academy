package d200206;

public class ArraryEx3 {
	public static void main(String[] args) {
		int []score=new int[5];
		int tot, ave;
		
		score[0]=60;
		score[1]=70;
		score[2]=80;
		score[3]=70;
		score[4]=80;
		
		tot=0;
		for(int i=0;i<score.length;i++) {
			tot+=score[i];
		}
		ave=tot/score.length;
		
		System.out.printf("ÇÕ°è: %d, Æò±Õ: %d",tot,ave);
	}
}
