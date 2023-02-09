public class Pattern_3 {

	public static void main(String[] args) {
		
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		int k = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				k++;
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
