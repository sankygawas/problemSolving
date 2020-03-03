/**
 * https://www.geeksforgeeks.org/print-given-matrix-zigzag-form/
 */
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
	    zigZagMatrix(matrix, 3, 3); 
			
	}
	
	/**
	 * 1 2 3 
	 * 4 5 6 
	 * 7 8 9
	 */

	private static void zigZagMatrix(int[][] matrix, int row, int col) {
		// TODO Auto-generated method stub
		
		boolean reverse = false;
		int j = 0;
		for(int i=0;i<row;i++) {
			
			if(!reverse)
				j = 0;
			else
				j = col-1;
			
			while((!reverse && j < col)  || (reverse && j>=0)) {
				
				System.out.println(matrix[i][j]);
				if(reverse) j--;
				else j++;
			}
			reverse = !reverse;
			
		}
	}

}
