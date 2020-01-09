package nam_d1;

public class Star6 {

	public static void main(String[] args) {
		for (int i =1; i<=5; i++ ) {
			for(int j =5; j>=1; j--) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

		}
		// 3번 별찍기 완료 - 12.29
	}