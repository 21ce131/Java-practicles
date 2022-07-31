/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : The problem is to check whether a given Sudoku solution is correct.*/

public class Part1_9 {
	public static boolean checkSol(int arr[][]) {
		boolean b = true;//putting a default boolean value.
		for(int i=0; i<9;i++) {
			int sum =0;
			//Checking if sum of each row is equal to 45. 
			for(int j=0;j<9;j++) {
				sum =sum+ arr[i][j];
			}
			//if the sum is not 45 means number from 1 to 9  are repeated somewhere to changing the boolean value and breaking loop.
			if(sum!=45) {
				b= false;
				break;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		//inputing the answer to a sudoku puzzle in 2D array.
		int a[][] = {{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
                };
		
		System.out.println(checkSol(a));

	}

}
