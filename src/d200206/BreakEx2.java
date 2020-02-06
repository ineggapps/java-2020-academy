package d200206;

public class BreakEx2 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for (int j=1;j<=3;j++) {
				if(i+j==4) {
					break;
				}
				System.out.println(i+", " +j);
			}
		}
		System.out.println("=====");
		// break labelName;
		gogogo:
			for(int i=1;i<=3;i++) {
				for (int j=1;j<=3;j++) {
					if(i+j==4) {
						break gogogo; //for(int i=1;i<=3;i++) 빠져나감
					}
					System.out.println(i+", " +j);
				}
			}
	}
}
