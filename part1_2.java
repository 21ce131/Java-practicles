/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given a string, return a string made of the first 2 chars (if present),
 however include first  char  only  if  it  is  'o' and  include  the  second 
 only  if  it  is  'z',  so  "ozymandias" yields "oz".*/

import java.util.*;

public class Part1_2 {
	// Method to check the first letters of the string.
	public static String checka (String y) {
		if(y.startsWith("oz")) {
			return "oz";
		}
		else if(y.startsWith("OZ")) {
			return "OZ";
		}
		else if(y.startsWith("o")) {
			return "o";
		}
		else if(y.startsWith("O")) {
			return "O";
		}
		else if(y.startsWith("z",1)) {
			return "z";
		}
		else if(y.startsWith("Z",1)) {
			return "Z";
		}
		else 
			return "";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//TO take the string from the user.
		String c = sc.nextLine();

		String d = checka(c);

		System.out.println(d);
	}
