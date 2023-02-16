public class Pattern_2 {

	public static void main(String[] args) {
		
		// *****
		// ****
		// ***
		// **
		// *
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 54321
		// 5432
		// 543
		// 54
		// 5
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
