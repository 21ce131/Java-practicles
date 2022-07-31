/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given an array of ints, return true if the sequence of numbers 1, 2, 3 
appears in the array somewhere.*/

public class Part1_4 {

	public static boolean array123(int[] x) {
		//loop to one by one check the whole array.
		for(int i=0 ; i<x.length-2 ; i++) {
			//to check weather three consecutive integers are 1,2,3.
			if (x[i]==1 && x[i+1]==2 && x[i+2]==3) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		//Test cases provided in the questions.
		int[] a = {1, 1, 2, 3, 1};
		int[] b = {1, 1, 2, 4, 1};
		int[] c = {1, 1, 2, 1, 2, 3};

		System.out.println(array123(a));
		System.out.println(array123(b));
		System.out.println(array123(c));

	}

}
