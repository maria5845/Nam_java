package nam_d1;

public class Star8 {

	public static void main(String[] args) {
	for (int i =1; i<=5; i++ ) {
		for(int j = 1; j<=5; j++) {
			if(i==j || i+j==6) {
				System.out.print("*");
			}else {
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}

	}
	// 4�� ����� �Ϸ� - 12.29
}
