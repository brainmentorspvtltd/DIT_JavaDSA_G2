public class Pattern_5 {

	public static void main(String[] args) {
		
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		int row = 5, col = 5;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
//				i == 0 - first row
//				j == 0 - first col
//				i == row-1 - last row
//				j == col-1 - last col
				if(i == 0 || j == 0 || i == row-1 || j == col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
//		*****
//		*   *
//		* * *
//		*   *
//		*****
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if((i == row/2 && j == col/2) || i == 0 || j == 0 || i == row-1 || j == col-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
