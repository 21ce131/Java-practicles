/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given an array of strings, return a new array without the strings that 
are equal to the target string. One approach is to count the occurrences of 
the target string, make a new array of the correct length, and then copy over 
the correct strings.*/

import java.util.Arrays;

public class Part1_6 {
	public static String[] wordsWithout(String[] x,String y) {
		//Logic to find the length of the corrected array.
		int nlen=0;
		for(int j=0; j<x.length;j++) {
			if(x[j].equals(y)) {
				nlen++;
			}
		}
		nlen=x.length-nlen;

		String[] correct=new String[nlen];
		int position=0;
		//copying the values of the x[] in correct[] except for the target string.
		for(int i=0 ; i<x.length; i++) {
			if(!x[i].equals(y)) {
				correct[position]= x[i];
				position++;
			}
	    }
		return correct;
	}
	public static void main(String[] args) {
		//test Cases given in the question.
		String[] m ={"a", "b", "c", "a"};
		String target ="a";
		//printing all strings in the array using Arrays.toString();
		System.out.println(Arrays.toString(wordsWithout(m, target)));

		String[] m1 ={"a", "b", "c", "a"};
		String target1 ="b";

		System.out.println(Arrays.toString(wordsWithout(m1, target1)));

		String[] m2 ={"a", "b", "c", "a"};
		String target2 ="c";

		System.out.println(Arrays.toString(wordsWithout(m2, target2)));
	}

}
