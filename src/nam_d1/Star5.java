package nam_d1;

public class Star5 {

	public static void main(String[] args) {
		for (int i =5; i>=1; i--) {
			for(int j =1; j<=5; j++) {
				if(j<=i){
					System.out.print("*");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

		}
		// 6번 별찍기 완료 - 12.29
	}
