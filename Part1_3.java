/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given two non-negative int values, return true if they have 
the same last digit, such as with 27 and 57. 
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
import java.util.*;

public class Part1_3 {

	public static boolean lastDigit (int a,int b) {
		//% with 10 will give us the last digit and comparing it with the other last digit number.
		if((a % 10) == (b % 10)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking input for both the numbers from the user.
		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.println(lastDigit(x,y));
	}

}
